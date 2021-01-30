package queue;

public class TestClass {

	public static void main(String[] args) {
		
		Queue q = new Queue(10);
		
		for (int i=1; i<=10; i++) {
			q.enqueue(i);
		}
		
		System.out.println("Is full? " + q.isFull());
		
		q.print();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(5);
		
		q.print();
		
		System.out.println("Size: " + q.size);
//		
	}

}
