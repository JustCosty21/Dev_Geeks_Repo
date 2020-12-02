package dev.geeks.mainpackage;

import dev.geeks.characters.Beast;
import dev.geeks.characters.Carl;
import dev.geeks.characters.StandardCharacter;

/**
 * 
 * @author Costel This class creates two players, Carl and the Beast and
 *         displays the fight between them.
 */
public class GameplayClass {

	public static void main(String[] args) {
		Carl c = new Carl();
		Beast b = new Beast();

		int turn = -1;
		if ((c.getSpeed() > b.getSpeed()) || (c.getSpeed() == b.getSpeed() && c.getLuck() > b.getLuck()))
			turn = 1;
		else
			turn = 2;

		if (turn == -1)
			System.exit(0);

		int healthOfCarl = c.getHealth();
		int healthOfBeast = b.getHealth();

		int powerOfCarl = c.getAttackPower();
		int powerOfBeast = b.getAttackPower();

		System.out.println("Welcome to the game! This is Carl. Carl has the following attributes: ");
		System.out.println("============================================================================");
		displayStatsOfCharacter(c);
		System.out.println("============================================================================");

		System.out.println("After drinking his morning coffee, Carl went for a walk in the magic forest.");
		System.out.println("There, he met a scary beast with the following stats: ");
		System.out.println("============================================================================");
		displayStatsOfCharacter(b);
		System.out.println("============================================================================");

		for (int playCount = 1; playCount <= 20; playCount++) {
			System.out.println("Round " + playCount + " starts: ");
			if (turn == 1) {
				Boolean useDragonPower = c.canUseDragonPower();

				int damageGiven = -1;
				if (useDragonPower) {
					damageGiven = c.attack(powerOfCarl * 2, b);
					healthOfBeast -= damageGiven;

					System.out.println("Carl uses the power of the dragon. He deals " + damageGiven + " damage.");
				} else {
					damageGiven = c.attack(powerOfCarl, b);
					healthOfBeast -= damageGiven;

					System.out.println("Carl deals " + damageGiven + " damage.");
				}

				if (healthOfBeast < 0)
					System.out.println("The beast remains with no health.");
				else
					System.out.println("The beast remains with " + healthOfBeast + " health.");
			} else {
				Boolean useTheCharmingShield = c.canUseTheCharmingShield();

				int damageGiven = -1;
				if (useTheCharmingShield) {
					damageGiven = b.attack(powerOfBeast / 2, c);
					healthOfCarl -= damageGiven;

					System.out.println(
							"Carl uses the power of the charming shield. The beast deals " + damageGiven + " damage.");
				} else {
					damageGiven = b.attack(powerOfBeast, b);
					healthOfCarl -= damageGiven;

					System.out.println("The beast deals " + damageGiven + " damage.");
				}

				if (healthOfCarl < 0)
					System.out.println("Carl remains with no health");
				else
					System.out.println("Carl remains with " + healthOfCarl + " health.");
			}

			if (healthOfCarl <= 0) {
				System.out.println("Beast won!");
				break;
			} else if (healthOfBeast <= 0) {
				System.out.println("Carl won!");
				break;
			}

			turn = getNextTurn(turn);

			System.out.println("============================================================================");
		}
	}

	/**
	 * 
	 * @param turn
	 * @return 2, if turn is 1 or otherwise.
	 */
	private static int getNextTurn(int turn) {
		return (turn == 1) ? 2 : 1;
	}

	/**
	 * Display the stats of the character.
	 * 
	 * @param c
	 */
	private static void displayStatsOfCharacter(StandardCharacter c) {
		System.out.println("Health: " + c.getHealth());
		System.out.println("Power: " + c.getAttackPower());
		System.out.println("Defense: " + c.getDefensePower());
		System.out.println("Speed: " + c.getSpeed());
		System.out.println("Luck: " + c.getLuck());
	}

}
