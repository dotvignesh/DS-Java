package stack;

public class StackLL {

	static class StackNode {
		
		int data;
		StackNode next;
		
		StackNode (int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	StackNode root;
	
	boolean isEmpty() {
		
		if (root == null) {
			return true;
		} else {
			return false;
		}
		
	}
	
	void push(int data) {
		
		
		StackNode newNode = new StackNode(data);
		if (root == null) {
			
			root = newNode;
			
		} else {
			
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
			
		}
		
		
		System.out.println(data + " pushed to stack");
		
	}
	
	int pop() {
		
		if (root == null) {
			System.out.println("Empty stack!");
			return -1;
		}
		
		int popped = root.data;
		root = root.next;
		
		return popped;
	}
	
	int peek() {
		
		if (root == null) {
			System.out.println("Empty stack");
			return -1;
		}
		
		return root.data;
		
	}
	
	
}
