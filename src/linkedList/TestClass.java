package linkedList;

public class TestClass {

	public static void main(String[] args) {
		
//		LinkedList list = new LinkedList();
//		
//		for (int i=1; i<=10; i++) {
//			list.insert(i);
//		}
//		
//		list.delete(9);
//		list.delete(8);
//		
//		list.deleteAt(2);
//		list.deleteAt(1);
//		list.printList();
		
		DLL list = new DLL();
		
		for (int i=1; i<=3; i++) {
			list.append(i);
		}

		list.printList();
		
		list.push(5);
		list.insertAfter(list.head, 10);
		list.printList();

	}

}
