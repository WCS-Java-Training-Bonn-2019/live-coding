import java.util.Arrays;
import java.util.Comparator;

public class TrimSort3Local {

	public static void main(String[] args) {
		
		/** Lokale Klasse (innerhalb von Blöcken) */
		class TrimmingComparator implements Comparator<String> {

			@Override
			public int compare(String s1, String s2) {

				return s1.trim().compareTo(s2.trim());

			}

		}
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };

		Arrays.sort(words, new TrimmingComparator());

		System.out.println(Arrays.toString(words));
		
	}
	
}
