package comparator;

public class Testprogramm {

	public static void main(String[] args) {
		
		Item foo = new Item("Foo", 3);
		Item bar = new Item("Bar", 5);
		
		int compare = foo.compareTo(bar);
		
		if (compare < 0)
			System.out.println("foo is smaller than bar");
		else if (compare > 0)
			System.out.println("foo is greater than bar");
		else
			System.out.println("foo and bar is equals");
		
	}
	
}
