
public class Testprogramm3 {

	public static void main(String[] args) {
		
		String[] members = {"John","Jane", "Jake"};
		Bootcamp b = new Bootcamp("Andre", members, 15);
		b.setMember("Michael");
		System.out.println(b);
		members[1] = "Julia";
		System.out.println(b);
		
	}
	
}
