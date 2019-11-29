import java.util.Arrays;
import java.util.Iterator;

public class Test extends Object implements A {

	public static void main(String[] args) {
		
		System.out.println(new int[][]{{1,2,3},{4,5,6}});
		
		int[][][] zahlen = {{{1,2},{1,2},{1,2}},{{1,2},{1,2},{1,2}}};
//		zahlen[1] = new int[] {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(Arrays.toString(zahlen[i]));
		}
		
	}

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}