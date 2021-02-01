package queue;

public class TestClass {

	public static void main(String[] args) {
		
		QueueLL q = new QueueLL();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		
		q.print();
		
		q.dequeue();
		q.dequeue();
		
		q.print();
		
		q.dequeue();
		q.dequeue();
		
		System.out.println("Is empty? " + q.isEmpty());
//		
	}

}
