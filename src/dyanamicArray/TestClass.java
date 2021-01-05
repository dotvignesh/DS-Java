package dyanamicArray;

public class TestClass {

	public static void main(String[] args) {
		
		DyanamicArray arr = new DyanamicArray();
		
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		
		
//		System.out.println(arr.size());
//		System.out.println(arr.getCapacity());

		
//		arr.print();
		arr.pop();
		arr.pop();
		
		arr.print();
		
	}

}
