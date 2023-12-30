package Zoo_ticket_management;

import java.util.Scanner;
import Zoo_ticket_management.z3;
public class z2 {

	public static void main(String[] args) {
		String name1,name2,name3,name4 ;
		int age1 , age2 , age3 , age4 ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Please Select The number of visitors ");
		System.out.println(" But For Package we allow 4 memebrs maximum only");
		System.out.println(" Choose an option: 1. Child-1  2. Couple-2  3.Family-4  4. Individual-1 ");
		int choice = scanner.nextInt();
		if (choice > 4 || choice < 1) {
			System.out.println("invalid option");
		}
		if (choice == 1) {

			System.out.println("you are Selected Child Package");
			System.out.println("Plese Enter The Child Name");
			name1 = scanner.next();
			System.out.println(" Please Enrer the Child Age");
			age1 = scanner.nextInt();
			System.out.println(" The price for this package is 1499/- only");

		}

		if (choice == 2) {

			System.out.println("you are Selected Couple Package please enter the 2 visitors details");
			System.out.println(" Please Enrer The your Name1");
			name1 = scanner.next();
			System.out.println(" Please Enrer  your Age1");
			age1 = scanner.nextInt();
			System.out.println(" Please Enrer The your Name2");
			name2 = scanner.next();
			System.out.println(" Please Enrer  your Age2");
			age2 = scanner.nextInt();
			System.out.println(" The price for this package is 2499/- only");
		}
		if (choice == 3) {

			System.out.println("you are Selected Family Package please enter 4 visitors details");
			System.out.println(" Please Enrer The your Name1");
			name1 = scanner.next();
			System.out.println(" Please Enrer  your Age1");
			age1 = scanner.nextInt();
			System.out.println(" Please Enrer The your Name2");
			name2 = scanner.next();
			System.out.println(" Please Enrer  your Age2");
			age2 = scanner.nextInt();
			System.out.println(" Please Enrer The your Name3");
			name3 = scanner.next();
			System.out.println(" Please Enrer  your Age3");
			age3 = scanner.nextInt();
			System.out.println(" Please Enrer The your Name4");
			name4 = scanner.next();
			System.out.println(" Please Enrer  your Age4");
			age4 = scanner.nextInt();
			System.out.println(" The price for this package is 4999/- only");
		}
		if (choice == 4) {

			System.out.println("you are Selected Individual Package");
		
			System.out.println("Plese Enter The Your Name1");
			name1 = scanner.next();
			System.out.println(" Please Enrer  your Age1");
			age1 = scanner.nextInt();
			System.out.println(" The price for this package is 1199/- only");
		}

	}

}
