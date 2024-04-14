package ScannerClassAssingment;

import java.util.Scanner;

public class SwithCaseWithScannerClassAssingment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		int input = s1.nextInt();
		System.out.println("The switch case input is :"+ input);
		
		switch(input){
			
		case  1 : 
			System.out.println("Hello this is case 1");
			break;
		
	   case  2 : 
		   System.out.println("Hello this is case 2");
		   break;
		   
	   case  3 : 
			System.out.println("Hello this is case 3");
			
	  Default  :
		  System.out.println("Hello this is case 4");
		}      


}
	
}
