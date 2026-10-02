package com.serilum.morezombievillagers;

import com.natamus.collective.objects.SAMObject;
import com.serilum.morezombievillagers.config.ConfigHandler;
import net.minecraft.world.entity.EntityType;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, null, ConfigHandler.zombieIsVillagerChance, false, false, false);
	}
}