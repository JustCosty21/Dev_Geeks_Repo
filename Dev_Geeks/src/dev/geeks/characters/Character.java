package dev.geeks.characters;

import java.util.Random;

public class Character {

	protected int health;
	protected int attackPower;
	protected int defensePower;
	protected int speed;
	protected int luck;

	public Character(int health, int attackPower, int defensePower, int speed, int luck) {
		this.health = health;
		this.attackPower = attackPower;
		this.defensePower = defensePower;
		this.speed = speed;
		this.luck = luck;
	}

	private static int createRandomNumber(int lowerLimit, int upperLimit) {
		Random ran = new Random();

		return ran.nextInt(upperLimit - lowerLimit) + lowerLimit;
	}

	protected static int createHealthCarl() {
		return createRandomNumber(65, 95);
	}

	protected static int createAttackCarl() {
		return createRandomNumber(60, 70);
	}

	protected static int createDefenseCarl() {
		return createRandomNumber(40, 50);
	}

	protected static int createSpeedCarl() {
		return createRandomNumber(40, 50);
	}

	protected static int createLuckCarl() {
		return createRandomNumber(10, 30);
	}

	protected static int createHealthBeast() {
		return createRandomNumber(55, 80);
	}

	protected static int createAttackBeast() {
		return createRandomNumber(50, 80);
	}

	protected static int createDefenseBeast() {
		return createRandomNumber(35, 55);
	}

	protected static int createSpeedBeast() {
		return createRandomNumber(40, 60);
	}

	protected static int createLuckBeast() {
		return createRandomNumber(25, 40);
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getDefensePower() {
		return defensePower;
	}

	public int getSpeed() {
		return speed;
	}

	public int getLuck() {
		return luck;
	}
}
