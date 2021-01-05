package dyanamicArray;

class DyanamicArray {
	
	private int arr[]; //declaring empty array
	private int capacity; //total capacity of the array
	private int current; //pointing the current number of elements 
	
	public DyanamicArray() {
		arr = new int[5];
		capacity = 5;
		current = 0;
	}
	
//	Add element to the end
	
	void push(int item) {
		
		if (capacity==current) {
			int temp[] = new int[2*capacity];
			for (int i=0; i<capacity; i++) {
				temp[i] = arr[i];
			}
			
			capacity*=2;
			arr = temp;
		}
		
		arr[current] = item;
		current++;
		
	}
	
   void push(int item, int index) {
		
		if (capacity==current) {
			push(item);
		}
		
		if (index < capacity) {
			arr[index] = item;
		} 
		
	}
	
	int get(int index) {
		
		if (index < current) {
			return arr[index];
		}
		
		return -1;
		
	}
	
	void pop() {
		current--;
	}
	
	int size() {
		return current;
	}
	
	int getCapacity() {
		return capacity;
	}
	
	void print() {
		
		for (int i=0; i<current; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
