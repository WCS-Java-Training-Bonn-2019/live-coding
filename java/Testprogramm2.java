import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Testprogramm2 {
	
	public static void main(String[] args) {
		
		int summe = 0;
		Scanner sc = null;
		try {
			sc = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Glück gehabt!");
		} catch (IOException e) {
			System.out.println("Auch Glück gehabt!");
		}
		
		while (sc.hasNext()) {
			summe += sc.nextInt();
		}
		
		for (int i = args.length - 1; i >= 0; i--) {
			summe += Integer.parseInt(args[i]);
		}
		
		System.out.println(summe);
		
		methodA();
		
	}
	
	public static void methodA() {
		methodB();
	}
	
	public static void methodB() {
		methodC();
	}
	
	public static void methodC() {
		throw new IllegalArgumentException();
	}
	
}
