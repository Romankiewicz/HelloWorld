package de.iav.day1;

import java.util.Scanner;

public class RelationalOperatoren {
	
	public static int summe(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Bitte geben sie 2 Zahlen zur Addition ein: ");
		
		Scanner varScanner = new Scanner(System.in);
		int x = varScanner.nextInt();
		int y = varScanner.nextInt();
		int summe = summe(x, y);
		varScanner.close();
		System.out.println("Das Ergebnis von " + x + " addiert mit " + y + " betraegt: " + summe);
		
	}

}
