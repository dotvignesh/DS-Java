package linkedList;

public class TestClass {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		for (int i=1; i<=10; i++) {
			list.insert(i);
		}
		
		list.delete(9);
		list.delete(8);
		
		list.deleteAt(2);
		list.deleteAt(1);
		list.printList();

	}

}
