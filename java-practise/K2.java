

class K2 extends K1 {

	private static int s;
	private int i;

	public K2(int i1) {
		i = i1;
	}

	K2(int i1, int i2) {
		super(i1);
		i = i1;
	}

	public int f() {
		i++;
		super.g();
		g();
		return i;
	}

	public static void g() {
		s++;
	}

	public void h() {
		s++;
	}

	public String toString() {
		return "s=" + s + ", i=" + i;
	}

}
