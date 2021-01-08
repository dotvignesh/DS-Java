package stack;

public class TestClass {

	public static void main(String[] args) {
		
		StackLL s = new StackLL();
		
		for (int i=1; i<=5; i++) {
			s.push(i);
		}
		
		System.out.println(s.peek() + " is in the top of the stack");
		System.out.println(s.pop() + " has been popped from the stack");
		System.out.println(s.peek() + " is in the top of the stack");
		
//		System.out.println(s.pop() + " popped from stack");
//		System.out.println(s.pop() + " popped from stack");

	}

}
