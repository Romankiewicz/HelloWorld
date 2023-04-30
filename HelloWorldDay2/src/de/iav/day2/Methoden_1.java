package de.iav.day2;

import java.util.Scanner;

public class Methoden_1 {

	public static int sum(int x, int y) {
		int summe = x + y;
		return summe;
	}
	
	public static String sumString(int x, int y) {
		String summeString = "Summe: " + (x + y);
		return summeString;
	}
	
	public static int scan() {
		System.out.println("dieses Programm errechnet die Summe zweier Zahlen.");
		Scanner numScanner = new Scanner(System.in);
		System.out.println("bitte die erst Zahl eingeben: ");
		int var1 = numScanner.nextInt();
		if(var1 > 100) {
			System.out.println("Wert 1 ist größer als 100");
		} else {
			System.out.println(" ");
		}
		System.out.println("bitte die zweite Zahl eingeben: ");
		int var2 = numScanner.nextInt();
		if(var2 > 100) {
			System.out.println("Wert 2 ist großer als 100");
		} else {
			System.out.println(" ");
		}
		numScanner.close();
		System.out.println("die Summe beider Zahlen betraegt: ");
		int sum = var1 + var2;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(29, 17));
		System.out.println(sumString(40, 364));
		System.out.println(scan());
	}

}
