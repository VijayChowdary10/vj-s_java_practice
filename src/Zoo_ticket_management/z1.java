package Zoo_ticket_management;

import java.util.Scanner;

public class z1 {

	public static void main(String[] args) {
		System.out.println(" WELCOME TO HYDERABAD ZOO-LOGICAL PARK\n");
		System.out.println("choose any  option 1. New Visitor 2.Regular Visitor");
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();// B for visitor Identity Input
		if (B < 1 || B > 2) {
			System.out.println("Invalid option");
			System.exit(0);
		}
		if (B == 1) {
			System.out.println("Sorry Sir! This -ZOO- Is for Only Paid  Coustamers \nIf U want to visit  the zoo ");
			System.out.println(
					"Please go and collect the Discount ACSESS cards for HYDERABAD ZOO-LOGICAL PARK Head Office");
			System.out.println("You Can Contact Them By +91 8317508153");

		}
		if (B == 2) {
			System.out.println(
					" Oh! You Are Regular visitor, But Sorry Sir Present We dont have Any discounts Dueto The season");

		}
		z3.main(args);
		z2.main(args);
		z4.main(args);

		OTPGenerator.main(args);

	}
}
