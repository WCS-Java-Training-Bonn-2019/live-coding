

public class TestK1K2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		K1 k1 = new K1(1);
		K2 k2 = new K2(2);
		int i;
		k1.f(i = 1);
		k2.f(i = 1);
		System.out.println("k1: " + k1);
		System.out.println("k2: " + k2);
		K2 k3 = new K2(3, 4);
		k3.f();
		k3.h();
		System.out.println("k1: " + k1);
		System.out.println("k2: " + k2);
		System.out.println("k3: " + k3);
		K1 k4 = new K2(5, 6);
		System.out.println("k4: " + k4);
		k4.f(2);
		k4.h();
		System.out.println("k4: " + k4);
	}

}
