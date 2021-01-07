package stack;

public class Stack {

	static final int MAX = 1000;
	int top;
	int arr[] = new int[MAX];
	
	Stack () {
		top = -1;
	}
	
	boolean isEmpty() {
		return top<0;
	}
	
	boolean push(int data) {
		
		if (top >= (MAX-1)) {
			
			System.out.println("Stack overflow");
			return false;
			
		} else {
			
			arr[++top] = data;
			System.out.println(data + " pushed into stack.");
			return true;
			
		}
		
	}
	
	int pop() {
		
		if (top>0) {
			
			int d = arr[top--];
			return d;
			
		} else {
			
			System.out.println("Stack underflow");
			return -1;
			
		}
		
	}
	
	int peek() {
		
		if (top < 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			return arr[top];
		}
		
	}
	
}
