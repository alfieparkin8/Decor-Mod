package net.PugGam3erp.decormod.item;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.item.custom.ModAxeItem;
import net.PugGam3erp.decormod.item.custom.ModHoeItem;
import net.PugGam3erp.decormod.item.custom.ModMusicDiscItem;
import net.PugGam3erp.decormod.item.custom.ModPickaxeItem;
import net.PugGam3erp.decormod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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

    public static final Item SAPPHIRE_SHARD = registerItem("sapphire_shard", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterials.SAPPHIRE,3, -2.4F, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterials.SAPPHIRE, 2.0F, -2.5F, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new ModPickaxeItem(ModToolMaterials.SAPPHIRE, 2, -2.8F, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new ModAxeItem(ModToolMaterials.SAPPHIRE, 6.0F, -3.0F, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new ModHoeItem(ModToolMaterials.SAPPHIRE, -3, 0.0F, new FabricItemSettings().group(ModItemGroup.DECOR)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.DECOR)));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.DECOR)));


    public static final Item ALFIE_MUSIC_DISC = registerItem("alfie_music_disc",
            new ModMusicDiscItem(7, ModSounds.ALFIE,
                    new FabricItemSettings().group(ModItemGroup.DECOR).maxCount(1)));
    public static final Item LUCA_MUSIC_DISC = registerItem("luca_music_disc",
            new ModMusicDiscItem(7, ModSounds.LUCA,
                    new FabricItemSettings().group(ModItemGroup.DECOR).maxCount(1)));
    public static final Item ELLIE_MUSIC_DISC = registerItem("ellie_music_disc",
            new ModMusicDiscItem(7, ModSounds.ELLIE,
                    new FabricItemSettings().group(ModItemGroup.DECOR).maxCount(1)));
    public static final Item SHANN_MUSIC_DISC = registerItem("shann_music_disc",
            new ModMusicDiscItem(7, ModSounds.SHANN,
                    new FabricItemSettings().group(ModItemGroup.DECOR).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DecorMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DecorMod.LOGGER.info("Registering Mod Items for " + DecorMod.MOD_ID);
    }

}
