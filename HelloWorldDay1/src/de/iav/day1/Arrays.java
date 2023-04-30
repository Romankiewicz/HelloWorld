package de.iav.day1;


public class Arrays {

	public static void main(String[] args) {
		
		int[] numArray = {31, 373, 4};
		
		System.out.println("Wert der 1. Arrayposition: " + numArray[0]);
		System.out.println("Wert der 3. Arrayposition: " + numArray[2]);
		int sumArray = numArray[0] + numArray[1];
		System.out.println("die Summe der 1. und 2. Arrayposition betraegt: " + sumArray);
		System.out.println("Das Array hat eine Laenge von: " + numArray.length);
	}

}
