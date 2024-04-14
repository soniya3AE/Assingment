package LoopsAssingment;

import java.util.Scanner;

public class Assingment10TimesUserInputAtRunTimeForAreaOfCircle {

	public static void main(String[] args) {
		final double pi=3.142;

       //formula of area of circle is  3.142*r*r
		for(int i = 0; i <=10; i++) {
			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter a user input");
			
			int r = s1.nextInt();
			double  area_of_circle = pi*r*r;
			System.out.println("The area of circle is : "+ area_of_circle);
		}
		
		
	}

}
