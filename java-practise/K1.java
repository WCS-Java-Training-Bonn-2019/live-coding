

@SuppressWarnings("all")
class K1 {

	public static int s;
	public int i;

	K1() {
		s++;
	}

	K1(int i) {
		i = i;
	}

	public int f(int x) {
		s += x;
		return i++;
	}

	public static void g() {
		++s;
	}

	public void h() {
		f(s);
		g();
	}

	public String toString() {
		return "s=" + s + ", i=" + i;
	}

}
