package Zoo_ticket_management;

import java.util.Scanner;

public class z7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO THE BLOCK OF CRUEL ANIMAL  ");

		String a[] = { "LION", "TIGER", "LEOPARD", "CHEETHA", "CROCODILE" };
		String b;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Please Select the purticular ANIMAL name You Want To know the details");
		for (int i = 0; i < a.length; i++) {

			b = sc.next();
			if (a[0].compareTo(b) == 0) {
				System.out.println("you are selected the LION, here are the details");
				System.out.println("total we have 4 LIONS taken from DELHI ");
				System.out.println("life span is 64 months ");
				System.out.println("Adopted by KALYAN");

			}

			else if (a[1].compareTo(b) == 0) {
				System.out.println("you are selected the TIGER, here are the details");
				System.out.println("total we have 5 TIGERS taken from AMERICA ");
				System.out.println("life span is 65 months ");
				System.out.println("Adopted by KALYAN");

			}

			else if (a[2].compareTo(b) == 0) {
				System.out.println("you are selected the LEOPARD, here are the details");
				System.out.println("total we have 8 LEOPARDS taken from Africa ");
				System.out.println("life span is 80 months ");
				System.out.println("Adopted by KALYAN");

			}

			else if (a[3].compareTo(b) == 0) {
				System.out.println("you are selected the CHEETHA, here are the details");
				System.out.println("total we have  CHEETHA taken from DUBAI ");
				System.out.println("life span is 68 months ");
				System.out.println("Adopted by KALYAN");

			}

			else if (a[4].compareTo(b) == 0) {
				System.out.println("you are selected the CROCODILE, here are the details");
				System.out.println("total we have 10 CROCODILE taken from SRILANKA ");
				System.out.println("life span is 125 months ");
				System.out.println("Adopted by KALYAN");
			}

		}
	}

}
