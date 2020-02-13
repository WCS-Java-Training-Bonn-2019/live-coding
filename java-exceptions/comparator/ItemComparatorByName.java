package comparator;

import java.util.Comparator;

public class ItemComparatorByName implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	public static void main(String[] args) {
		
		Item foo = new Item("Foo", 3);
		Item bar = new Item("Bar", 5);
		
		ItemComparatorByName c = new ItemComparatorByName();
		int compare = c.compare(foo, bar);
		
		if (compare < 0)
			System.out.println("foo is smaller than bar");
		else if (compare > 0)
			System.out.println("foo is greater than bar");
		else
			System.out.println("foo and bar is equals");
		
	}
}
