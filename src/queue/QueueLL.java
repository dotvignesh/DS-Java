package queue;

public class QueueLL {
	
//	Impementing Queue node
	static class QNode {
		
		int data;
		QNode nextNode;
		
		QNode(int data) {
			this.data = data;
			this.nextNode = null;
		}
		
	}
	
//	Initialize queue linked list
	QNode front, rear;
	int size = 0;
	QueueLL() {
		this.front = this.rear = null;
	}
	
//	in this case root/head node is front and the end node is rear
	void enqueue(int data) {
	
		QNode newNode = new QNode(data);
		
		if (rear == null) {
			front = rear = newNode;
			size++;
			return;
		}
		
		rear.nextNode = newNode;
		rear = newNode;
		
		size++;
		
		
	}
	
	void dequeue() {
		
		if (front == null) {
			System.out.println("Queue empty!");
			size--;
			return;
		}
		
		front = front.nextNode;
		size--;
		
		if (front == null) {
			rear = null;
		}
		
	}
	
	void print() {
		
		System.out.println("Printing front to rear:");
		
		QNode currNode = front;
		while(currNode != null) {
			
			System.out.println(currNode.data);
			currNode = currNode.nextNode;
			
		}
		
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	
	

}
