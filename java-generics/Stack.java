import java.util.Arrays;

public class Stack<T> {

	/* Instanzvariablen */
	
	private T[] stack;
	
	/* Konstruktoren */
	
	public Stack() {
		this.stack = (T[]) new Object[0];
	}
	
	/* Instanzmethoden */
	
	public void push(T item) {
		T[] stack = (T[]) new Object[this.stack.length + 1];
		for (int i = 0; i < this.stack.length; i++)
			stack[i] = this.stack[i];
		stack[stack.length - 1] = item;
		this.stack = stack;
	}
	
	public T pop() {
		T item = this.stack[this.stack.length - 1];
		T[] stack = (T[]) new Object[this.stack.length - 1];
		for (int i = 0; i < stack.length; i++)
			stack[i] = this.stack[i];
		this.stack = stack;
		return item;
	}
	
	public boolean isEmpty() {
		return stack.length == 0;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(stack);
	}
	
	/* Klassenmethoden */

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		System.out.println(s);
		System.out.println("Empty: " + s.isEmpty());
		s.push(5);
		System.out.println(s);
		System.out.println("Empty: " + s.isEmpty());
		int item = s.pop();
		System.out.println(s);
		System.out.println("Empty: " + s.isEmpty());
		
	}
	
}
