import java.util.Arrays;
import java.util.Comparator;

public class TrimSort4Anonym {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };

		/** Anonyme Klasse (innerhalb einer Ausdrucksanweisung) */
		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {

				return s1.trim().compareTo(s2.trim());

			}

		} );

		System.out.println(Arrays.toString(words));
		
	}
	
}
