package net.cheesecakeslice.allthefoods;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllTheFoods implements ModInitializer {
	public static final String MOD_ID = "all-the-foods";
    public static final Logger LOGGER = LoggerFactory.getLogger("all-the-foods");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}