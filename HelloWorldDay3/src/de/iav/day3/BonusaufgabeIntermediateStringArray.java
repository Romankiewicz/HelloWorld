package de.iav.day3;

import java.util.Scanner;

public class BonusaufgabeIntermediateStringArray {

	public static String numString() {
		String[] stringArray = {"Eins", "Zwei", "Drei", "Vier", "Fuenf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
		System.out.println("Bitte geben sie eine Zahl zwischen 1 und 10 ein");
		Scanner numScanner = new Scanner(System.in);
		int numScan = numScanner.nextInt();
		numScanner.close();
		switch(numScan) {
			case 1:
				System.out.println(stringArray[0]);
				return " ";
			case 2:
				System.out.println(stringArray[1]);
				return " ";
			case 3:
				System.out.println(stringArray[2]);
				return " ";
			case 4:
				System.out.println(stringArray[3]);
				return " ";
			case 5:
				System.out.println(stringArray[4]);
				return " ";
			case 6:
				System.out.println(stringArray[5]);
				return " ";
			case 7:
				System.out.println(stringArray[6]);
				return " ";
			case 8:
				System.out.println(stringArray[7]);
				return " ";
			case 9:
				System.out.println(stringArray[8]);
				return " ";
			case 10:
				System.out.println(stringArray[9]);
				return " ";
		}
		return " ";
	}
	
	public static void main(String[] args) {
		
		numString();
	}

}