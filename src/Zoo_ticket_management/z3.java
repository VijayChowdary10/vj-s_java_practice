package Zoo_ticket_management;

public class z3 {

	public static void main(String[] args) {
		System.out.println("We have 4 packages sir/medam select ");

		String[] k = new String[] { "Elephant", "Monkeys", "Horses", "Donkeys", "Dogs ", "Snakes ", "Tigers", "Bears",
				"", "", "", "", "", "" };
		String[] c = new String[] { "Elephant", "        Monkeys", "        Horses", "        Donkeys", "        Dogs ",
				"        Snakes ", "        Tigers", "        Bears", "        Leopards", "        Rhaino",
				"        Hippo-potamus", "        Flowers", "        honey bees ", "        park Acess" };

		String[] f = new String[] { "Elephant", "        Monkeys", "        Horses", "        Donkeys", "        Dogs ",
				"        Snakes ", "        Tigers", "        Bears", "Leopards", "        Rhaino", "Hippo-potamus",
				"        Flowers", "honey bees ", "park Acess" };
		String[] s = new String[] { "Elephant", "        Monkeys", "        Horses", "        Donkeys", "        Dogs ",
				"        Snakes ", "        Tigers", "        Bears", "Leopards", "        Rhaino", "Hippo-potamus",
				"        Flowers", "honey bees ", "park Acess" };

		do {
			System.out.println("Child Package" + "\t\t" + "Couple Package" + "\t\t" + "Famiy Package" + "\t\t"
					+ "Individual Package");

			System.out.println("\n");
			for (int i = 0; i < 14; i++)
				System.out.println(k[i] + "\t\t" + c[i] + "\t\t" + f[i] + "\t\t" + s[i]);

		} while (false);
	}

}
