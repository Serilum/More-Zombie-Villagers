package com.serilum.morezombievillagers;

import com.natamus.collective.objects.SAMObject;
import com.serilum.morezombievillagers.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.ZOMBIE, EntityTypes.ZOMBIE_VILLAGER, null, ConfigHandler.zombieIsVillagerChance, false, false, false);
	}
}