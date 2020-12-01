package dev.geeks.mainpackage;

import dev.geeks.characters.Beast;
import dev.geeks.characters.Carl;

public class GameplayClass {

	public static void main(String[] args) {
		Carl c = new Carl();
		Beast b = new Beast();

		System.out.println(c.getHealth());
		System.out.println(b.getHealth());
	}

}
