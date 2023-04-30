package de.iav.day2;

import java.util.Scanner;

public class Alarmstufe {

		public static int number() {
			Scanner personScanner = new Scanner(System.in);
			int num = personScanner.nextInt();
			personScanner.close();
			return num;
			
		}
		public static String personString() {
			String upperLevel = "Personenanzahl ist erreicht!!!";
			String lowerLevel = "Personenanzahl ist noch nicht erreicht.";
			
			if(number() < 30) {
				return lowerLevel;
			} else if(number() > 30) {
				return upperLevel;
			}else {
				return " ";
			}
			
		}
		
		public static String alarmString() {
			int indicator = 0;
			int person = number();
			while(person >0 && person <30) {
				indicator = 1;
			}
			while(person >30 && person <60) {
				indicator = 2;
			}
			while(person >60) {
				indicator = 3;
			}
			switch(indicator) {
				case 1:
					return "Alarmstufe Gruen: Maximal 60 Personen erlaubt!";
				case 2:
					return "Alarmstufe Gelb: Maximal 30 Personen erlaubt!";
				case 3:
					return "Alarmstufe Rot: Keine weiteren personen erlaubt!!!";
				default: 
					return " ";
			}
		}

		public static void main(String[] args) {
			number();
			System.out.println("Bitte geben sie die aktuelle Personenzahl an: ");
			System.out.println(personString());
			System.out.println(alarmString());
			
		}
}
