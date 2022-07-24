package net.PugGam3erp.decormod.entity;


import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.GreenSnakeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<GreenSnakeEntity> GREEN_SNAKE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(DecorMod.MOD_ID, "green_snake"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GreenSnakeEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 0.1f)).build());
}