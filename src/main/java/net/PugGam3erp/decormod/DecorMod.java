package net.PugGam3erp.decormod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecorMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("decormod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
