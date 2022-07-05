package net.PugGam3erp.decormod.item;

import net.PugGam3erp.decormod.DecorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RED_BRICK = registerItem("red_brick",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DecorMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DecorMod.LOGGER.info("Registering Mod Items for " + DecorMod.MOD_ID);
    }

}
