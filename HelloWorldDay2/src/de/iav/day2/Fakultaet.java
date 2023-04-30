package de.iav.day2;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) {
		int i = 1;
		int fact = 1;
		System.out.println("Bitte geben sie eine Zahl ein, die Fakultaet wird berechent. ");
		Scanner numScanner = new Scanner(System.in);
		int num = numScanner.nextInt();
		numScanner.close();
		
		for(i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("die Fakultaet von " + num + "betraegt: " + fact);
	}

}
