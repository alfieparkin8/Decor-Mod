package net.PugGam3erp.decormod;

import net.PugGam3erp.decormod.block.ModBlocks;
import net.PugGam3erp.decormod.item.ModItems;
import net.PugGam3erp.decormod.util.ModRegistries;
import net.PugGam3erp.decormod.world.feature.ModConfiguredFeatures;
import net.PugGam3erp.decormod.world.gen.ModTreeGeneration;
import net.PugGam3erp.decormod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecorMod implements ModInitializer {
	public static final String MOD_ID = "decormod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();

	}
}
