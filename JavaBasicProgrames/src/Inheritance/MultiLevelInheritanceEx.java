package Inheritance;


class GrandParentClass{

	static void fetchingUserName() {
		System.out.println("this is grand parent");

	}
	
}

class parent extends GrandParentClass {
	
	static void login_using_UN() {
		System.out.println("this is parent");
		
	}
	
}


public class MultiLevelInheritanceEx  extends parent {
	
	static void TestCase1_Adding_Productto_cart() {
		
		System.out.println("This is Grand child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCase1_Adding_Productto_cart();
		login_using_UN();
		fetchingUserName();

	}

}
