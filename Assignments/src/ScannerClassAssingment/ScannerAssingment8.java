package ScannerClassAssingment;

import java.util.Scanner;

public class ScannerAssingment8 {
//Execute scanner class with global variable
	int a =0;
	int b=0;
	
	public void add() {
		System.out.println("add :"+ a+b);
		
	}
	public void sub() {
		System.out.println("sub:" + (a-b));
		
	}
	public void mul() {
		System.out.println("mul :"+ a*b);
		
	}

	public void div() {
		System.out.println("div :"+ a/b);
		
	}
	public void mod() {
		System.out.println("mod:"+ a%b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerAssingment7 s1= new ScannerAssingment7();
		

		Scanner s2 = new Scanner(System.in);
	    System.out.println("Enter a value");
		int a = s2.nextInt();
	    System.out.println("Enter b value");
		int b = s2.nextInt();
		
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		s1.mod();
         

		

	}

}

	
