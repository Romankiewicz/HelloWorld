package de.iav.day2;

import java.util.Scanner;

public class FakultaetWhile {

	public static void main(String[] args) {
		int i = 1;
		int fact = 1;
		
		System.out.println("Bitte geben sie eine Zahl ein, die Fakultaet wird berechnet. ");

		Scanner numScanner = new Scanner(System.in);
		int num = numScanner.nextInt();
		numScanner.close();
		
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("die Fakultaet von " + num + " betraegt: " + fact);
		
	}

}
