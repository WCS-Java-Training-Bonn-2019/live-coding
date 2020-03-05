import java.util.Arrays;

public class TrimSort5Lambda {

	public static void main(String[] args) {

		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };

		/** Lambda-Ausdruck (ausführliche Schreibweise) */
		Arrays.sort(words, (String s1, String s2) -> {
			return s1.trim().compareTo(s2.trim());
		} );

		System.out.println(Arrays.toString(words));

	}

}
