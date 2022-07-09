package net.PugGam3erp.decormod.item;

import net.PugGam3erp.decormod.DecorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item WHITE_BRICK = registerItem("white_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item ORANGE_BRICK = registerItem("orange_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item MAGENTA_BRICK = registerItem("magenta_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item LIGHT_BLUE_BRICK = registerItem("light_blue_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item YELLOW_BRICK = registerItem("yellow_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item LIME_BRICK = registerItem("lime_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item PINK_BRICK = registerItem("pink_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item GRAY_BRICK = registerItem("gray_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item LIGHT_GRAY_BRICK = registerItem("light_gray_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item CYAN_BRICK = registerItem("cyan_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item PURPLE_BRICK = registerItem("purple_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item BLUE_BRICK = registerItem("blue_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item BROWN_BRICK = registerItem("brown_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item GREEN_BRICK = registerItem("green_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item RED_BRICK = registerItem("red_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item BLACK_BRICK = registerItem("black_brick", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DecorMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DecorMod.LOGGER.info("Registering Mod Items for " + DecorMod.MOD_ID);
    }

}
