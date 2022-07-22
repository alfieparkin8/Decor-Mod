package net.PugGam3erp.decormod.block.entity;

import net.PugGam3erp.decormod.block.entity.ModBlockEntities;
import net.PugGam3erp.decormod.item.ModItems;
import net.PugGam3erp.decormod.screen.FletchingTableScreenHandler;
import net.PugGam3erp.decormod.util.inventory.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class FletchingTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    public FletchingTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FLETCHING_TABLE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Fletching Table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new FletchingTableScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, FletchingTableBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(FletchingTableBlockEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);

        entity.setStack(2, new ItemStack(Items.SPECTRAL_ARROW,
                entity.getStack(2).getCount() + 1));
    }

    private static boolean hasRecipe(FletchingTableBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == Items.ARROW;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.GLOWSTONE;

        return hasItemInFirstSlot && hasItemInSecondSlot;
    }

    private static boolean hasNotReachedStackLimit(FletchingTableBlockEntity entity) {
        return entity.getStack(2).getCount() < entity.getStack(2).getMaxCount();
    }
}