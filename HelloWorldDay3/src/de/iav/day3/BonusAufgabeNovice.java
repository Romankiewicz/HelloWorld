package de.iav.day3;

import java.util.Scanner;

public class BonusAufgabeNovice {
	
	public static String nameString() {
		int i = 0;
		String nameString = "Mathias";
		while(i <= 4) {
			System.out.println(nameString);
			i++;
		}
		return nameString;
	}
	
	public static boolean numCheck() {
		System.out.println("bitte geben sie eine Zahl ein: ");
		Scanner numScanner = new Scanner(System.in);
		int number = numScanner.nextInt();
		numScanner.close();
		boolean num = false;
		if(number > 0) {
			num = true;
		}else {
			num = false;
		}
		System.out.println("die Zahl: " + number + " ist groesser als 0: " + num);
		return num;
	}
	
	public static String greatingString() {
		System.out.println("bitte geben sie ihren Namen ein: ");
		Scanner nameScanner = new Scanner(System.in);
		String nameString = nameScanner.next();
		nameScanner.close();
		System.out.println("Hallo " + nameString);
		return nameString;
	}
	
	public static void main(String[] args) {
//		nameString();
//		numCheck();
		greatingString();
	}
}
