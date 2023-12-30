package Zoo_ticket_management;

import java.util.Scanner;

public class z4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Thanks For Choosing This Package Please pay The Amount");
		System.out.println("After PAyment You Get An Otp Plese Submit/Show the Otp At Gate to Enter");

		System.out.println("Choose an option: 1. PHONE-PAY  2. PAYTM  3.G-PAY");
		int choice = sc.nextInt();

		if (choice > 3 || choice < 1) {
			System.out.println("invalid option");
		}

		if (choice == 1) {
			System.out.println("We Just Sent A Link To Your Phone-Pay Account");
			System.out.println("Open Your Phone-Pay Account And Pay in 2 Minites");
			System.out.println("The Payment is Done ");
		}
		if (choice == 2) {
			System.out.println("We Just Sent A Link To Your PAYTM Account");
			System.out.println("Open Your PAYTM Account And Pay in 5 Minites");
			System.out.println("The Payment is Done ");
		}
		if (choice == 3) {
			System.out.println("We Just Sent A Link To Your G-PAY Account");
			System.out.println("Open Your G-PAY Account And Pay in 3 Minites");
			System.out.println("The Payment is Done ");
		}

	}

}
