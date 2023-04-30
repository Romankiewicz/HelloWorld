package de.iav.day3;

import java.util.Arrays;
import java.util.Scanner;


public class BonusaufgabeIntermediateScanner {

	public static void repeater() {
		System.out.println("Bitte geben sie die Laenge des Arrays ein: ");
		Scanner stringScanner = new Scanner(System.in);
		int m = stringScanner.nextInt();
		
		String[] input = new String[m];
		
		System.out.println("Der Inhalt des Arrays ist: ");
		System.out.println(Arrays.toString(input));
		
		System.out.println("Bitte geben sie die Elemente des Arrays ein: ");
		for (int i = 0; i < m; i++){
			String inputString = stringScanner.next();
			input[i] = inputString;
			System.out.println("Der Inhalt des Arrays ist: ");
			System.out.println(Arrays.toString(input));
		}
		
		stringScanner.close();
	}
	
	public static void main(String[] args) {
		
		repeater();

	}

}
