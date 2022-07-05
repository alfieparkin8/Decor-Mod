package net.PugGam3erp.decormod.item;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DECOR = FabricItemGroupBuilder.build(new Identifier(DecorMod.MOD_ID, "decor"),
            () -> new ItemStack(ModBlocks.CHERRY_BLOSSOM_PLANKS));
}
