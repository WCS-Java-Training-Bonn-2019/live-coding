package hashing;

public class Testprogramm {

	// Array + Hash-Funktion + Kollision
	// Hashfunktion berechnet idealerweise in O(1)
	// Möglichst gute Verteilung um Kollissionen gering zu halten
	// Ähnliche Werte sollten nicht zu ähnlichen Hashwerten führen
	// für Zahlen zum Beispiel h(i) = i mod N
	// Auflösung einer Kollission entweder durch Verkettung oder 
	
	public static void main(String[] args) {
		
		Testprogramm t = new Testprogramm();
		System.out.println(t.hashCode());
	}	
	
}
