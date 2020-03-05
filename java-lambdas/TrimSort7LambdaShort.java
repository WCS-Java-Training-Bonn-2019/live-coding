import java.util.Arrays;

public class TrimSort7LambdaShort {

	public static void main(String[] args) {

		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };
		
		/** Lambda-Ausdruck (minimale Schreibweise) */
		Arrays.sort(words, (s1, s2) -> s1.trim().compareTo(s2.trim()) );

		System.out.println(Arrays.toString(words));

	}

}
