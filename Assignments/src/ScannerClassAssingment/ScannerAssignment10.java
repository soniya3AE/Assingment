package ScannerClassAssingment;

import java.util.Scanner;

public class ScannerAssignment10 {

	//Find the Circumference of the Circle having 'pi' as static, final and Global and r via Scanner class
	final static double pi=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter r value");
		int r = s1.nextInt();
		double circumference = 2*pi*r;
		System.out.println("Circumference:"+circumference );
		
		
		

	}

}
