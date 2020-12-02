package dev.geeks.characters;

import java.util.Random;

public class Carl extends StandardCharacter {
	public Carl() {
		super(true, createHealthCarl(), createAttackCarl(), createDefenseCarl(), createSpeedCarl(), createLuckCarl());
	}

	public Boolean canUseDragonPower() {
		Random rand = new Random();

		return rand.nextDouble() < 0.10;
	}

	public Boolean canUseTheCharmingShield() {
		Random rand = new Random();

		return rand.nextDouble() < 0.20;
	}

}
