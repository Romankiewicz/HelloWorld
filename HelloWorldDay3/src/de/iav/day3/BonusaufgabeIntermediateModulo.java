package de.iav.day3;

public class BonusaufgabeIntermediateModulo {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			int a = i % 3;
			int b = i % 5;
			if(a == 0) {
				System.out.println("#" + i);
				
			} else if(b == 0) {
				System.out.println("$" + i);
			} else {
				System.out.println(i);
			}
		}
		

	}

}
 