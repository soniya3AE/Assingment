package MultiLevelInheritanceAssignement;

class GrandGrandParent {
	
	static void grandGrandParentM1() {
		System.out.println("This is grand grand Parent Leave1");
	}

}

class GreateGrandParent extends GrandGrandParent  {
	static void greateGrandParentM2() {
		System.out.println("This is GreateGrandParent  Leave2");
	}

}

class GrandParent extends GreateGrandParent {
	static void grandParentM3() {
		System.out.println("This is GrandParent  Leave3");
	}
}

class Parent1 extends GrandParent  {
	static void parentM4() {
		System.out.println("This is Parent  Leave4");
	}

}

public class MultiLevelInheritanceAssingment14EX extends Parent1 {
	static void child5() {
		System.out.println("This is child  Leave5");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grandGrandParentM1();
		greateGrandParentM2();
		grandParentM3();
		 parentM4();
		 child5();
		

	}

}
