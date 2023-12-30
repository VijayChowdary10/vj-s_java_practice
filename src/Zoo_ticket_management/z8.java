package Zoo_ticket_management;

import java.util.Scanner;

public class z8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO THE BLOCK OF  KIDS-->PARK-WORLD");

		String a[] = { "ROLLERCOASTER", "GAINTWILL", "TRAIN", "SWIMMINGPOOL", "RAINDANCE" };
		String b;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Please Select the purticular PLACE name You Want To know the  PRICE details");
		for (int i = 0; i < a.length; i++) {

			b = sc.next();
			if (a[0].compareTo(b) == 0) {
				System.out.println("you are selected the ROLLERCOASTER, here are the details");
				System.out.println("total we have 8 KM length of the track ");
				System.out.println("price per ticket is 499/- only ");
				System.out.println("if you want to buy the ticket go to the quee and take only cash ");

			}

			else if (a[1].compareTo(b) == 0) {
				System.out.println("you are selected the GAINTWILL, here are the details");
				System.out.println("total we have 150 meters height ");
				System.out.println("price per ticket is 399/- only ");
				System.out.println("if you want to buy the ticket go to the quee and take only cash ");

			}

			else if (a[2].compareTo(b) == 0) {
				System.out.println("you are selected the TRAIN, here are the details");
				System.out.println("total we have 8 KM length of the track ");
				System.out.println("price per ticket is 499/- only ");
				System.out.println("if you want to buy the ticket go to the quee and take only cash ");

			}

			else if (a[3].compareTo(b) == 0) {
				System.out.println("you are selected the SWIMMINGPOOL, here are the details");
				System.out.println("total we have 4 acers length of the pool ");
				System.out.println("price per ticket is 799/- only ");
				System.out.println("if you want to buy the ticket go to the quee and take only cash ");

			}

			else if (a[4].compareTo(b) == 0) {
				System.out.println("you are selected the RAINDANCE, here are the details");
				System.out.println("total we have 2 acers length of the rain dance with disco lights and DJ sound ");
				System.out.println("price per ticket is 799/- only ");
				System.out.println("if you want to buy the ticket go to the quee and take only cash ");
			}

		}

	}

}
