import java.util.Arrays;
import java.util.Comparator;

public class TrimSort6LambdaVar {

	public static void main(String[] args) {

		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };

		/** Lambda-Ausdruck (Speicherung von Code in einer Variablen) */
		Comparator<String> c = (s1, s2) -> s1.trim().compareTo(s2.trim());
		
		Arrays.sort(words, c);

		System.out.println(Arrays.toString(words));

	}

}
