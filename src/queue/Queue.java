package queue;

class Queue {
	
	int front, rear, size, capacity;
	int arr[];
	
//	Initializing queue 
	Queue(int capacity) {
		
		this.capacity = capacity;
		front = size = 0;
		rear = -1;
		arr = new int[this.capacity];
		
	}
	
//	Checking if the queue is empty
	boolean isEmpty() {
		return size == 0;
	}
	
	
//	Checking if the queue is full
	boolean isFull() {
		return capacity == size;
	}
	
	
//	Adding element to end(rear) of the queue 
	void enqueue(int item) {
		
		if (isFull()) {
			System.out.println("The queue is full!");
			return;
		}
		
		rear = (rear+1) % capacity;
		arr[rear] = item;
		size++;
		
		System.out.println(item +" enqueued to the queue");
		
	}
	
//	Removing element from front of the queue 
	void dequeue() {
		
		if (isEmpty()) {
			System.out.println("The queue is empty!");
			return;
		}
		
		int item = arr[front];
		front = (front+1) % capacity;
		size--;
		
		System.out.println(item + " dequeued from the queue");
		
	}
	
//	Get front of queue
	int front() {
		
		if (isEmpty()) {
			System.out.println("The queue is empty!");
			return -1;
		}
		
		return arr[front];
		
	}
	
	
//	Get rear of queue
	int rear() {
		
		if (isEmpty()) {
			System.out.println("The queue is empty!");
			return -1;
		}
		
		return arr[rear];
		
	}
	
//	Print queue
	void print() {
		
		for (int i=0; i<size; i++) {
			System.out.print(arr[(front + i) % capacity] + ", ");
		}
		
		System.out.println();
		
	}

}
