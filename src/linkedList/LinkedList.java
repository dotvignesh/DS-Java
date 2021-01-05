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
	public LinkedList insert(LinkedList list, int data) {
		
		Node newNode = new Node(data);
		
		if (list.head == null) {
			list.head = newNode;
		} else {
			
			Node lastNode = list.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			lastNode.next = newNode;
			
		}
		
		return list;
	}
	
//	Print all elements of linked list
	public void printList(LinkedList list) {
		
		Node currNode = list.head;
		
		System.out.print("Linked list: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			
			currNode = currNode.next;
		}
		
	}
	
//	Delete given element from linked list
	public LinkedList delete(LinkedList list, int key) {
		
		Node currNode = list.head;
		Node prev = null;
		
//		Looking at head node
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println(key +" was found at head and is deleted from the list.");
			
			return list;
		}
		
//		Looking for key at loc other than head and keeping track of prev node
		while (currNode!=null && currNode.data != key) {
			
			prev = currNode;
			currNode = currNode.next;
			
		}
		
		if (currNode != null) {
			
			prev.next = currNode.next;
			System.out.println(key +" was found and deleted from the list.");
			
			return list;
			
		} else {
			System.out.println(key +" was not found in the list.");	
		}
		
		
		return list;
		
	}
	
//	Delete element at given index
	public LinkedList deleteAt(LinkedList list, int index) {
		
		Node currNode = list.head, prev = null;
		
		if (index == 0) {
			list.head = currNode.next;
			return list;
		}
		
		int counter = 0;
		
		while (currNode != null) {
			
			if (index == counter) {
				
				prev.next = currNode.next;
				return list;
				
			} else {
				
				prev = currNode;
				currNode = currNode.next;
				counter++;
				
			}
			
		}
		
		System.out.println("There's no element at index " + index);
		
		return list;
	}

}
