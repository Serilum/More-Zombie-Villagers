package com.serilum.morezombievillagers.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.morezombievillagers.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double zombieIsVillagerChance = 0.25;
	@Entry public static boolean onlySpawnZombieVillagersOnSurface = false;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("zombieIsVillagerChance", Arrays.asList(
			"The overridden chance a new zombie spawn is of the villager variant."
		));
		configMetaData.put("onlySpawnZombieVillagersOnSurface", Arrays.asList(
			"When enabled, zombie villagers will only spawn on the surface."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which zombies can turn into zombie villagers, separated by a comma. Leave empty for every dimension. For example: 'minecraft:overworld'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which zombies can turn into zombie villagers, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:plains,#minecraft:is_taiga'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}