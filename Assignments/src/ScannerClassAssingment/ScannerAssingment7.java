package ScannerClassAssingment;

import java.util.Scanner;

public class ScannerAssingment7 {
// Execute the Scanner Class with all the methods using local Variable

	public void add() {
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a value");
	int a = s1.nextInt();
    System.out.println("Enter b value");
	int b = s1.nextInt();
	int sum = a+b;
    System.out.println("sum of a and b is : "+ sum);
	}
	
	public void sub() {
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a value");
	int a = s1.nextInt();
    System.out.println("Enter b value");
	int b = s1.nextInt();
	int sub= a-b;
    System.out.println("sub of a and b is : "+ sub);
	}
	public void mul() {
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a value");
	int a = s1.nextInt();
    System.out.println("Enter b value");
	int b = s1.nextInt();
	int mul = a*b;
    System.out.println("mul of a and b is : "+ mul);
	}
	public void div() {
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a value");
	int a = s1.nextInt();
    System.out.println("Enter b value");
	int b = s1.nextInt();
	int div = a/b;
    System.out.println("div of a and b is : "+ div);
	}
	public void mod() {
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a value");
	int a = s1.nextInt();
    System.out.println("Enter b value");
	int b = s1.nextInt();
	int mod = a%b;
    System.out.println("mod of a and b is : "+ mod);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerAssingment7 s1= new ScannerAssingment7();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		s1.mod();
		

	}

}
