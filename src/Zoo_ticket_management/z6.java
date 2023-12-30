package Zoo_ticket_management;

import java.util.Scanner;

public class z6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO THE BLOCK OF WILD ANIMAL  ");

		String a[] = { "WOLF", "DEER", "ELEPHANT", "HIPPO-POTAMUS", "RHAINO" };
		String b;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Please Select the purticular ANIMAL name You Want To know the details");
		for (int i = 0; i < a.length; i++) {

			b = sc.next();
			if (a[0].compareTo(b) == 0) {
				System.out.println("you are selected the WOLF, here are the details");
				System.out.println("total we have 14 WOLFS taken from GREEN LAND ");
				System.out.println("life span is 54 months ");
				System.out.println("Adopted by BHARATH");

			}

			else if (a[1].compareTo(b) == 0) {
				System.out.println("you are selected the DEER, here are the details");
				System.out.println("total we have 5 DEER taken from ANTARCITICA ");
				System.out.println("life span is 100 months ");
				System.out.println("Adopted by VIJAY");

			}

			else if (a[2].compareTo(b) == 0) {
				System.out.println("you are selected the ELEPHANT, here are the details");
				System.out.println("total we have 8 ELEPHANTS taken from Africa ");
				System.out.println("life span is 280 months ");
				System.out.println("Adopted by HARSHITH");

			}

			else if (a[3].compareTo(b) == 0) {
				System.out.println("you are selected the HIPPO-POTAMUS, here are the details");
				System.out.println("total we have  HIPPO-POTAMUS taken from DUBAI ");
				System.out.println("life span is 28 months ");
				System.out.println("Adopted by MASTHAN");

			}

			else if (a[4].compareTo(b) == 0) {
				System.out.println("you are selected the RHAINO, here are the details");
				System.out.println("total we have 10 RHAINO taken from SRILANKA ");
				System.out.println("life span is 125 months ");
				System.out.println("Adopted by SANTHARAO");
			}

		}

	}

}
