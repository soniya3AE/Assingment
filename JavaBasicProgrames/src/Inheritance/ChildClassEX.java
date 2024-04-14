package Inheritance;

class ParentClass {

	static void add() {
		System.out.println("this is static in Parent method");
	}

}

public class ChildClassEX extends ParentClass {

	static void add1() {
		System.out.println("this is static in child  method");
	}

	public static void main(String[] args) {
		
		add();
		add1();

	}

}
