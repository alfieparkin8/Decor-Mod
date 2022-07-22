package net.PugGam3erp.decormod.screen;

import net.PugGam3erp.decormod.DecorMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<FletchingTableScreenHandler> FLETCHING_TABLE_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(DecorMod.MOD_ID, "fletching_table"),
                    FletchingTableScreenHandler::new);
}
