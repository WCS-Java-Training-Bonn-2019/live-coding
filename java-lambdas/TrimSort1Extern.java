import java.util.Arrays;

public class TrimSort1Extern {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };

		Arrays.sort(words, new TrimmingComparator());	/** externe Klasse */

		System.out.println(Arrays.toString(words));
		
	}
	
}
