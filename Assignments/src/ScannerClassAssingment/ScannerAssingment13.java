package ScannerClassAssingment;

import java.util.Scanner;

public class ScannerAssingment13 {
	static double pi=3.14;

	//Area of Circle with human input at the Run time for 10 times
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the r1 value");
			int r1 = s1.nextInt();
			
			double area_of_circle= pi*r1*r1;
			System.out.println("the area of circle is : "+ area_of_circle);

		}

		

		
		
		

	}

}
