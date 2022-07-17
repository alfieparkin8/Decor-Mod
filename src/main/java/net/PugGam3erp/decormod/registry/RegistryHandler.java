package net.PugGam3erp.decormod.registry;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.block.TemplatePotBlock;
import net.PugGam3erp.decormod.item.ModItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;

public class RegistryHandler {
    public static final Block WHITE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block ORANGE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block MAGENTA_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block LIGHT_BLUE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block YELLOW_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block LIME_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block PINK_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block GRAY_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block LIGHT_GRAY_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block CYAN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block PURPLE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block BLUE_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block BROWN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block GREEN_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block RED_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());
    public static final Block BLACK_FLOWER_POT = new TemplatePotBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.0f).nonOpaque());

    public static void register() {
        for (Field field : RegistryHandler.class.getDeclaredFields()) {
            try {
                Object object = field.get(null);
                if (object instanceof Block block) {
                    Identifier identifier = new Identifier(DecorMod.MOD_ID, field.getName().toLowerCase());

                    Registry.register(Registry.BLOCK, identifier, block);
                    Registry.register(Registry.ITEM, identifier, new BlockItem(block, new Item.Settings().group(ModItemGroup.DECOR)));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}