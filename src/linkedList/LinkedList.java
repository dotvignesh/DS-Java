package linkedList;

public class LinkedList {
	
//	Linked list node
	static class Node {
		
		int data;
		Node next;
		
		Node (int d) {
			data = d;
			next = null;
		}
		
	}
	
	Node head;
	
//	Insert element at the end of the linked list
	public void insert(int data) {
		
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		} else {
			
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			lastNode.next = newNode;
			
		}
		
	}
	
//	Print all elements of linked list
	public void printList() {
		
		Node currNode = head;
		
		System.out.print("Linked list: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			
			currNode = currNode.next;
		}
		
	}
	
//	Delete given element from linked list
	public void delete(int key) {
		
		Node currNode = head, prev = null;
		
//		Looking at head node
		if (currNode != null && currNode.data == key) {
			head = currNode.next;
			System.out.println(key +" was found at head and is deleted from the list.");
			
			return;
		}
		
//		Looking for key at loc other than head and keeping track of prev node
		while (currNode!=null && currNode.data != key) {
			
			prev = currNode;
			currNode = currNode.next;
			
		}
		
		if (currNode != null) {
			
			prev.next = currNode.next;
			System.out.println(key +" was found and deleted from the list.");
			
			return;
			
		} else {
			System.out.println(key +" was not found in the list.");	
		}
		
	}
	
//	Delete element at given index
	public void deleteAt(int index) {
		
		Node currNode = head, prev = null;
		
		if (index == 0) {
			head = currNode.next;
			return;
		}
		
		int counter = 0;
		
		while (currNode != null) {
			
			if (index == counter) {
				
				prev.next = currNode.next;
				
				System.out.println("Element at " + index + " has been deleted from the list.");
				return;
				
			} else {
				
				prev = currNode;
				currNode = currNode.next;
				counter++;
				
			}
			
		}
		
		System.out.println("There's no element at index " + index);

	}

}
