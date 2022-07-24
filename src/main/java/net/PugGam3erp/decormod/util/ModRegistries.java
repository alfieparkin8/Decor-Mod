package net.PugGam3erp.decormod.util;

import net.PugGam3erp.decormod.block.ModBlocks;
import net.PugGam3erp.decormod.entity.ModEntities;
import net.PugGam3erp.decormod.entity.custom.SnakeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
        registerAttributes();
    }

    private static  void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_LOG,ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_WOOD,ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD);
    }

    private static void registerFlammableBlock(){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.CHERRY_BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.CHERRY_BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.CHERRY_BLOSSOM_PLANKS, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_PLANKS, 30, 60);
    }

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.SNAKE, SnakeEntity.setAttributes());
    }

}
