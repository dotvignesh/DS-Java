package linkedList;

public class TestClass {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		for (int i=1; i<=10; i++) {
			list.insert(list, i);
		}
		
		list.delete(list, 8);
		list.delete(list, 9);
		
		list.printList(list);
		
		System.out.println();
		list.deleteAt(list, 2);
		list.printList(list);

	}

}
