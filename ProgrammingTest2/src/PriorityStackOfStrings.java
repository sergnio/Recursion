
public class PriorityStackOfStrings {
	private String[] data;
	private String[] prioData;
	private int last;
	private int prioLast;
	private static int default_size = 4;
	
	public PriorityStackOfStrings() {
		this.data = new String[default_size];
		this.prioData = new String[default_size];
		this.last = 0;
		this.prioLast = 0;
	}
	public int size() {
		return this.prioLast + this.last;
	}
	public boolean isEmpty() {
		return (data.length == 0) && (prioData.length ==0);

	}
	
	public boolean isFull() {
		return (size() == this.data.length) && (size() == this.prioData.length);
	}
	
	public void push(String s, boolean priority) {
		if (isFull()) {
			String[] newData = new String[this.data.length * 2];
			for (int i = 0; i < this.data.length; i++ ) {
				newData[i] = this.data[i];
			String[] newData2 = new String[this.prioData.length * 2];
			for (int q = 0; q <this.prioData.length; q++ ) {
				newData2[q] = this.prioData[q];
			}
			
			this.data = newData;
			this.prioData = newData2;
		}
		if (priority == true) {
			this.prioData[prioLast] = s;
			this.prioLast++;
		}
		else {
		this.data[last] = s;		
		this.last++;
		}
		}
	}
	public String pop() throws RuntimeException {
		if (isEmpty()) {			
			throw new RuntimeException("Stack is empty!");
		}
		if (prioData.length < 0) {
			String returnValue = this.prioData[this.prioLast - 1];
			this.prioLast--;
			return returnValue;
		}
		if (prioData.length == 0) {
			String returnValue = this.data[this.last-1];
			this.last--;
			return returnValue;
		}
		return pop();
	}
		
	public static void main(String[] args) {
	PriorityStackOfStrings p = new PriorityStackOfStrings();
	p.push("person", false);
	p.push("gaga", true);
	p.push("russ", false);
	p.push("jd", true);
	StdOut.println(p.pop());
	StdOut.println(p.pop());
	StdOut.println(p.pop());
	StdOut.println(p.pop());
	}
	}