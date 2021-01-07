package stack;

public class TestClass {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for (int i=0; i<999; i++) {
			s.push(i+1);
		}
		
		s.push(1);
		s.push(0);
//		System.out.println(s.pop() + " popped from stack");
//		System.out.println(s.pop() + " popped from stack");

	}

}
