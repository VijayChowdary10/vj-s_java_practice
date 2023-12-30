package Zoo_ticket_management;

import java.util.Scanner;

public class z5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO THE BLOCK OF BIRDS  ");

		String a[] = { "PARROT", "PEA-COCK", "OSTRICHE", "DOVE", "AMERICAN CROW" };
		String b;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Please Select the purticular bird name You Want To know the details");
		for (int i = 0; i < a.length; i++) {

			b = sc.next();
			if (a[0].compareTo(b) == 0) {
				System.out.println("you are selected the PARROT, here are the details");
				System.out.println("total we have 4 parrots taken from australia ");
				System.out.println("life span is 54 months ");
				System.out.println("Adopted by Manasa");

			}

			else if (a[1].compareTo(b) == 0) {
				System.out.println("you are selected the PEA-COCK, here are the details");
				System.out.println("total we have 5 PEA-COCK taken from America ");
				System.out.println("life span is 100 months ");
				System.out.println("Adopted by Swapna");

			}

			else if (a[2].compareTo(b) == 0) {
				System.out.println("you are selected the OSTRICHE, here are the details");
				System.out.println("total we have 2 OSTRICHE taken from Africa ");
				System.out.println("life span is 120 months ");
				System.out.println("Adopted by Alice");

			}

			else if (a[3].compareTo(b) == 0) {
				System.out.println("you are selected the DOVE, here are the details");
				System.out.println("total we have  DOVE taken from australia ");
				System.out.println("life span is 18 months ");
				System.out.println("Adopted by Priyanka");

			}

			else if (a[4].compareTo(b) == 0) {
				System.out.println("you are selected the AMERICAN CROW, here are the details");
				System.out.println("total we have 10 parrots taken from australia ");
				System.out.println("life span is 25 months ");
				System.out.println("Adopted by Harshitha");
			}

		}
	}
}
