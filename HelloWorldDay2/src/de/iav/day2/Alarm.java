package de.iav.day2;

import java.util.Scanner;

public class Alarm {
	
	public static String persons() {
		
		Scanner personScanner = new Scanner(System.in);
		int personNum = personScanner.nextInt();
		String lowerLevel = "Maximale Personenzahl ist noch nicht erreicht.";
		String upperLevel = "Maximale Personenzahl ist erreicht!!!";
		personScanner.close();
		
		if(personNum < 30) {
			return lowerLevel;
		}else if (personNum > 30) {
			return upperLevel;
		}else {
			return " ";
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Bitte geben sie die aktuelle Personenzahl an: ");
		System.out.println(persons());
	}
}
