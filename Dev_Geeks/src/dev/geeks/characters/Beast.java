package dev.geeks.characters;

public class Beast extends StandardCharacter {

	public Beast() {
		super(false, createHealthBeast(), createAttackBeast(), createDefenseBeast(), createSpeedBeast(),
				createLuckBeast());
	}

}
