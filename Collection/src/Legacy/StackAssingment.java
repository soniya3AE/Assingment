package Legacy;

import java.util.Stack;

public class StackAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1 = new Stack();
		Stack s2= new Stack();

		s1.add(20);
		System.out.println(s1);
		s1.add(1, 23);
		System.out.println(s1);
		s2.add(30);
		s2.add(31);
		s2.add(32);
		s1.addAll(s2);
		System.out.println(s1);
		s1.push("soniya");
		System.out.println("After pushing the s1 stack contains: "+s1);

		
		

	}

}
