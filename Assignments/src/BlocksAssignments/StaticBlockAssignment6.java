package BlocksAssignments;

public class StaticBlockAssignment6 {

	
	//Creating one more object for SIB,IIB,CON,MM program
	
	//creating static block with static keyword
	static {
		System.out.println("This is static block");
		 
	}
	
	//this is instance block
	{
		System.out.println("This is instance block");
	}
	
	//This is constructor 
	StaticBlockAssignment6(){
		System.out.println("this is constructor special method executing ");
	}
	public static void main(String[] args) {		
		//creating object of class type
		
		StaticBlockAssignment6 a6 = new StaticBlockAssignment6();
		System.out.println("********************************************");
		new StaticBlockAssignment6();
		System.out.println("********************************************");

		new StaticBlockAssignment6();
		System.out.println("********************************************");

		new StaticBlockAssignment6();


		
		
		

	}

}
