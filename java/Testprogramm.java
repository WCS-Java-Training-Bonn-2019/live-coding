
public class Testprogramm {

	public static void main(String[] args) {
		
		int zustand = 5; // 01101
		
		int ii = (int) ((1L << 32) + 1L);
		System.out.println(ii);
		
		double test = Long.MAX_VALUE;
		System.out.println(test);
		System.out.println(Long.MAX_VALUE);
		System.out.println((long) test == Long.MAX_VALUE);
		
		float x = 2304f;			// 1bit Vorzeichen, 23bit Mantisse, 8bit Exponent
		float y = -4096f;
		float z = 4096.001953125f;
		
		System.out.println(x*(y+z));
		System.out.println(x*y + x*z);
		
		int zahl = 5;
		zahl = zahl++;				// Ausdruck liefert alten Wert
		System.out.println(zahl);
		
		
		// berechne Quersumme der Bits einer Ganzzahl
		int n = 12;				// 1100
		int quersumme = 0;
		
		int bit = 1; // 001 010 100
		for (int i = 0; i < 32; i++) {			// 1100
			if ((n & bit) != 0) quersumme++;	// 0100
			bit = bit << 1;
		}
		
		System.out.println(quersumme);
		
		
		// puefe ob Schaltjahr
		int jahr = 2000;
		boolean istSchaltjahr = jahr % 4 == 0 && ( jahr <= 1582 || jahr % 100 != 0 || jahr % 400 == 0 );
		
		System.out.println(istSchaltjahr);

		// Einfache Datentypen
		boolean b = false;	//  1bit?
		byte by = 0;		//  8bit
		short h = 0;		// 16bit
		int i = 0;			// 32bit
		long l = 0;			// 64bit
		float f = 0.0f;		// 32bit
		double d = 0.0d;	// 64bit
		char c = '\u0000';	// 32bit
		
		// Referenzdatentypen
		String s = null;
		int[] a = null;
		Object o = null;
		
		int zeichen = 'A';
	
		String s1 = new String("Hallo");
		String s2 = "Hallo";
		
		System.out.println(s1 == s2);
		
	}
	
}




