package Zoo_ticket_management;

import java.util.Scanner;

public class z {

	public static void main(String[] args) {
		z1.main(args);
		System.out.println("Gate keeper--> We have 4 Blocks  For visit The  Complete Zoo Sir / medam");
		System.out.println("Choose 1.Birds BLOCK 2.Wild animals BLOCK 3.Cruel animals BLOCK 4.Park  BLOCK");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice > 4 || choice < 1) {
			System.out.println("invalid option");

		}
		if (choice == 1) {
			z5.main(args);

		}
		if (choice == 2) {
			z6.main(args);
		}
		if (choice == 3) {
			z7.main(args);
		}
		if (choice == 4) {
			z8.main(args);
		}
		System.out.println(" Thanks for visiting the Zoo-- I hope u Enjoying it ANd isit ag@in");
	}
}