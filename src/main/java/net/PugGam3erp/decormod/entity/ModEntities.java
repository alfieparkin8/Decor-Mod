package net.PugGam3erp.decormod.entity;


import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.SnakeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<SnakeEntity> SNAKE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(DecorMod.MOD_ID, "snake"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SnakeEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 0.25f)).build());
}