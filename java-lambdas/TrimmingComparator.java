import java.util.Comparator;

public class TrimmingComparator implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {

		return s1.trim().compareTo(s2.trim());

	}

}
