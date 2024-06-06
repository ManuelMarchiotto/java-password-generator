package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName;
		String lasName;
		String favouriteColor;
		
		int birthDay;
		int birthMonth;
		int birthYear;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi il tuo nome");
		firstName = scanner.nextLine();
		System.out.println("Scrivi il tuo cognome");
		lasName = scanner.nextLine();
		System.out.println("Scrivi il tuo colore prefertio");
		favouriteColor = scanner.nextLine();
		
		System.out.println("Scrivi il tuo giorno del compleanno");
		birthDay = scanner.nextInt();
		System.out.println("Scrivi il tuo mese del compleanno");
		birthMonth = scanner.nextInt();
		System.out.println("Scrivi il tuo anno del compleanno");
		birthYear = scanner.nextInt();
		
		int birthSum = birthDay + birthMonth + birthYear;
		
		String unsafePassword = firstName + "-" + lasName + "-"  + favouriteColor + "-"  + birthSum;
		
		System.out.println(unsafePassword);
		
		scanner.close();
		
	}

}
