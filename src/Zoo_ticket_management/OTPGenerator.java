package Zoo_ticket_management;

import java.security.SecureRandom;
import java.util.Scanner;

public class OTPGenerator {

	public static String generateOTP(int length) {
		if (length <= 0) {
			throw new IllegalArgumentException("OTP length must be a positive integer.");
		}

		String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		SecureRandom secureRandom = new SecureRandom();   //object creation fot in built method taken fron java-.lib
		StringBuilder otp = new StringBuilder(length);     // object creation for 8 th line

		for (int i = 0; i < length; i++) {
			int randomIndex = secureRandom.nextInt(characters.length());
			otp.append(characters.charAt(randomIndex));
		}

		return otp.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int otpLength = 6;
		String otp = generateOTP(otpLength);

		System.out.println("Generated OTP: " + otp);
		System.out.println("Please Enter The Otp To Enter Into Zoo");
		String c = sc.next();
		if (c.compareTo(otp)==0) {
			System.out.println("WELCOME TO THE ZOO");
		}
	}
}
