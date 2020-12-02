package dev.geeks.characters;

import java.util.Random;

/**
 * 
 * @author Costel
 * 
 *         This class creates a standard type character from which Carl and the
 *         Beast will inherit.
 */
public class StandardCharacter {

	protected Boolean isHuman;
	protected int health;
	protected int attackPower;
	protected int defensePower;
	protected int speed;
	protected int luck;

	public StandardCharacter(Boolean isHuman, int health, int attackPower, int defensePower, int speed, int luck) {
		this.isHuman = isHuman;
		this.health = health;
		this.attackPower = attackPower;
		this.defensePower = defensePower;
		this.speed = speed;
		this.luck = luck;
	}

	/**
	 * 
	 * @param luck
	 * @return true if the attack is missed, false otherwise
	 */
	protected Boolean attackIsMissed(int luck) {
		return new Random().nextDouble() < (luck / 100);
	}

	/**
	 * 
	 * @param lowerLimit
	 * @param upperLimit
	 * @return a random number between lowerLimit and upperLimit
	 */
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

	/**
	 * 
	 * @param power
	 * @param o
	 * @return remaining health of the character that is attacked
	 */
	public int attack(int power, StandardCharacter o) {
		if (attackIsMissed(o.getLuck())) {
			System.out.println("This character happened to be lucky and was not hit.");
			return 0;
		}

		int remainingHealth = o.getHealth();
		remainingHealth -= power - o.getDefensePower();

		if (remainingHealth < 0)
			return 0;
		else if (remainingHealth > 100)
			return 100;
		else
			return remainingHealth;
	}
}
