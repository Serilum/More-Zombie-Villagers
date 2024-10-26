package com.natamus.morezombievillagers.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.morezombievillagers.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double zombieIsVillagerChance = 0.25;

	public static void initConfig() {
		configMetaData.put("zombieIsVillagerChance", Arrays.asList(
			"The overridden chance a new zombie spawn is of the villager variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}