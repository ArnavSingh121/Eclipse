package src;

import java.util.Scanner;

public class Cube {
public static void main(String[] args) {
	
	System.out.println("Enter a nummber to be cubed: ");
	
	Scanner num = new Scanner (System.in);
		Double x = num.nextDouble();
		Double y = Math.pow(x, 3);
		System.out.println ( y );
	}
}
