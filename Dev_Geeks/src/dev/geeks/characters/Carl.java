package dev.geeks.characters;

import java.util.Random;

public class Carl extends Character {
	public Carl() {
		super(createHealthCarl(), createAttackCarl(), createDefenseCarl(), createSpeedCarl(), createLuckCarl());
	}
	
	private Boolean canUseDragonPower() {
		Random rand = new Random();
		
		return rand.nextDouble() < 0.10;
	}
	
	private Boolean canUseTheCharmingShield() {
		Random rand = new Random();
		
		return rand.nextDouble() < 0.20;
	}

}
