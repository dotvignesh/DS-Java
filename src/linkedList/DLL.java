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
	
//	Inserting element after a given node
	public void insertAfter(Node prevNode, int data) {
		
		if (prevNode == null) {
			System.out.println("The give node can't be null");
			return;
		}
		
		Node newNode = new Node(data);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}
		
	}
	
//	Inserting element before a given node
	public void insertBefore(Node nextNode, int data) {
		
		if (nextNode == null) {
			System.out.println("Given node can't be null");
		}
		
		Node newNode = new Node(data);
		
		newNode.prev = nextNode.prev;
		nextNode.prev = newNode;
		newNode.next = nextNode;
		
		
		if (nextNode.prev != null) {
			nextNode.prev.next = newNode;
		}
		
	}
	
//	Adding element at the end of the list
	public void append(int data) {
		
		Node newNode = new Node(data);
		Node lastNode = head;
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		lastNode.next = newNode;
		newNode.prev = lastNode;
		
	}

	
//	Print list
	public void printList() {
		
//		Forward traversal 
		
		System.out.println("Forward traversal: ");
		
		Node currNode = head;
		Node lastNode = null;
		while (currNode != null) {
			
			System.out.print(currNode.data + " ");
			lastNode = currNode;
			currNode = currNode.next;
			
		}
		
//		Backward traversal
		
		System.out.println("\nBackward traversal: ");
		
		while (lastNode != null) {
			
			System.out.print(lastNode.data + " ");
			lastNode = lastNode.prev;
			
		}
		
		System.out.println();
		
	}
	

}
