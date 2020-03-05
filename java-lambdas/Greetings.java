import java.util.ArrayList;

public class Greetings {

	public static void main(String[] args) {

		// Lambda-Ausdruck mit Parameter
		Greetable1 g1 = (String s, int i) -> s.repeat(i);
		System.out.println(g1.greet("Alaaf", 3));
		
		// alles in einem Ausdruck
		System.out.println( ( (Greetable1) ( (s, i) -> s.repeat(i) ) ).greet("Alaaf", 3) );
		
		// Lambda-Ausdruck ohne Parameter
		Greetable2 g2 = () -> System.out.println("Alaaf");
		g2.greet();
		
		// Lambda-Ausdruck mit genau einem Parameter
		Greetable3 g3 = s -> System.out.println(s);
		g3.greet("Alaaf");
		
		// Lambda-Ausdruck bei forEach-Schleife
		ArrayList<String> list = new ArrayList<String>();
		list.add("Alaaf");
		list.add("Alaaf");
		list.add("Alaaf");
		list.forEach( s -> System.out.print(s + " ") );
	}

}
