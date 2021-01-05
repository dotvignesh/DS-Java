package linkedList;

public class DLL {
	
//	Defining a node for DLL
	static class Node {
		
		int data;
		Node prev;
		Node next;
		
		Node(int d) {
			data = d;
			prev=null;
			next=null;
		}
		
	}
	
	Node head;
	
//	Pushing at the start of the list
	public void push(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		if (head != null) {
			head.prev = newNode;
		}
		
		head = newNode;
		
	}
	
	
	
	

}
