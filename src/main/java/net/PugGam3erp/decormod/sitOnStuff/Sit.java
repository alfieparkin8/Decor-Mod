package net.PugGam3erp.decormod.sitOnStuff;

import net.PugGam3erp.decormod.block.ModBlocksTags;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static net.PugGam3erp.decormod.sitOnStuff.SitEntity.OCCUPIED;

public class Sit
{

    public static final EntityType<SitEntity> SIT_ENTITY_TYPE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("decormod", "entity_sit"),
            FabricEntityTypeBuilder.<SitEntity>create(SpawnGroup.MISC, SitEntity::new).dimensions(EntityDimensions.fixed(0.001F, 0.001F)).build()
    );


    public static void main(String[] args) {
        List<String> SITABLES = new ArrayList<>();
        SITABLES.add("oak_chair");
    }

    public static void sitMain()
    {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if(world.isClient)
            {
                return ActionResult.PASS;
            }

            if(!world.canPlayerModifyAt(player, hitResult.getBlockPos()))
            {
                return ActionResult.PASS;
            }

            BlockState state = world.getBlockState(hitResult.getBlockPos());
            Block block = world.getBlockState(hitResult.getBlockPos()).getBlock();

            if (!OCCUPIED.containsKey(new Vec3d(hitResult.getBlockPos().getX(), hitResult.getBlockPos().getY(), hitResult.getBlockPos().getZ())))
            {
                Vec3d comparePos = new Vec3d(hitResult.getBlockPos().getX(), hitResult.getBlockPos().getY(), hitResult.getBlockPos().getZ());

                boolean sneakingAndEmpty = player.getStackInHand(hand).isEmpty() && !player.isSneaking();


                // IS CHAIR?
                if(state.isIn(ModBlocksTags.CHAIRS) && sneakingAndEmpty)
                {
                    SitEntity sit = SIT_ENTITY_TYPE.create(world);
                    Vec3d pos = new Vec3d(hitResult.getBlockPos().getX() + 0.5D, hitResult.getBlockPos().getY() + 0.35, hitResult.getBlockPos().getZ() + 0.5D);

                    OCCUPIED.put(comparePos, player.getBlockPos());
                    sit.updatePosition(pos.getX(), pos.getY(), pos.getZ());
                    world.spawnEntity(sit);
                    player.startRiding(sit);
                    return ActionResult.SUCCESS;
                }

            }

            return ActionResult.PASS;
        });
    }


}