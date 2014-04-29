
public class ArrayStackOfStrings {

	private String[] data;
	private int last;
	private static int DEFAULT_SIZE = 4;

	// constructor
	public ArrayStackOfStrings() {
		this.data = new String[DEFAULT_SIZE];
		this.last = 0;
	}

	public ArrayStackOfStrings(String[] data) {
		this.data = data;
		this.last = data.length;
	}

	public int size() {
		return this.last;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == this.data.length);
	}

	// push
	public void push(String s) {
		if (isFull()) {
			// double the capacity and copy
			String[] newData = new String[this.data.length * 2];
			for (int i = 0; i < this.data.length; i++ ) {
				newData[i] = this.data[i];
			}
			// assign the new array as our data array
			this.data = newData;
		}
		this.data[last] = s;		
		this.last++;
	}

	// pop
	public String pop() throws RuntimeException {
		String returnValue = peek();
		this.last--;
		return returnValue;
	}

	// peek
	public String peek() throws RuntimeException {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		String returnValue = this.data[this.last - 1];
		return returnValue;
	}

	public static void main(String[] args) {
		ArrayStackOfStrings myStack = new ArrayStackOfStrings();
		myStack.push("Dan");
		myStack.push("Meghan");
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		myStack.push("Rebecca");
		myStack.push("Nick");
		myStack.push("Lucas");
		myStack.push("Yunong");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());

	}
}
