package ScannerClassAssingment;

import java.util.Scanner;

public class ScannerAssignment9 {
	//Find the Area of the Circle having 'pi' as static, final and Global with int radius and double radius using Scanner class
	
	final static  double pi =3.14;
	int r1=2;
	double r2=2.22;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter value of radius in int");
		int r1 = s1.nextInt();
		System.out.println("Please enter the value of radius in double");
		double r2= s1.nextDouble();
		double area_of_circle = pi*r1*r2;
		System.out.println("the area of circle is :"+ area_of_circle);
		
		

	}

}
