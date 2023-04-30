package de.iav.day2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Bitte um eingabe einer Zahl: ");
		Scanner valScanner = new Scanner(System.in);
		int i = valScanner.nextInt();
		if (i>0 &&i <10) {
			
			System.out.println("Da geht noch mehr...");
			
		} else if (i>10 && i<20) {
			
			System.out.println("schon besser...");
			
		} else if (i>20){
			
			System.out.println("Speicher überladen! Kritischer error! Selbstzerstoerung eingeleitet!");
			System.out.println("5");
			System.out.println("4");
			System.out.println("3");
			System.out.println("2");
			System.out.println("1");
			System.out.println("lauf!!!");
		} else {
			
			System.out.println("zahl nicht erkannt...");
		}
		
		System.out.println("Bitte geben sie eine Zahl zwischen 1 und 3 ein: ");
		
		int x = valScanner.nextInt();
		
		
		switch (x) {
		  case 1:
			  System.out.println("1? Wirklich?");
			  valScanner.nextInt();
			  valScanner.close();
			  return;
		  case 2:
			  System.out.println("naja...");
			  valScanner.nextInt();
			  valScanner.close();
			  return;
		  case 3: 
			  System.out.println("Danach haben wir gesucht ;)");
			  valScanner.nextInt();
			  valScanner.close();
			  return;
			
		}
		valScanner.close();
//		while (<boolean>) {}
//
//		do {} while (<boolean>);
//		for (int x = 0; x < 100; ++x) {}
	}

}
