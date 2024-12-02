package dev.williammmm.extendedmetallurgy;

import dev.williammmm.extendedmetallurgy.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WilliammmmsExtendedMetallurgy implements ModInitializer {
	public static final String MOD_ID = "williammmms_extended_metallurgy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
	}
}