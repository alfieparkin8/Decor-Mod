package net.PugGam3erp.decormod;

import net.PugGam3erp.decormod.block.ModBlocks;
import net.PugGam3erp.decormod.item.ModItems;
import net.PugGam3erp.decormod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecorMod implements ModInitializer {
	public static final String MOD_ID = "decormod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
