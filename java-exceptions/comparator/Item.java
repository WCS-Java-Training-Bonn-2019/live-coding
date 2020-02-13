package comparator;

public class Item implements Comparable<Item> {

	private String name;
	private int age;
	
	public Item(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Item other) {
		return this.name.compareTo(other.name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Item-" + this.name + "-" + this.age;
	}
}
