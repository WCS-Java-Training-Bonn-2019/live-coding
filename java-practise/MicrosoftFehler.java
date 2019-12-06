

/**
 * Zum Jahreswechsel 2008 nach 2009 waren zahlreiche neuentwickelte Musikspielgeräte
 * der Firma Microsoft kaum noch bedienbar, weil im Programmcode zur Berechnung des
 * Datums ein Fehler vorhanden war (was man dann erst nachträglich analysiert hat).
 * Hier ist der relevante Ausschnitt aus der Berechnung:
 */
public class MicrosoftFehler {
	
	public static void main(String[] args) {

		System.out.println(berechneJahr(10593));

	}

	static int berechneJahr(int days) {
		int year = 1980; // 01.01.1980 ist der Tag 1

		while (days > 365) {
			if (isLeapYear(year)) {
				if (days > 366) {
					days = days - 366;
					year = year + 1;
				}
			} else {
				days = days - 365;
				year = year + 1;
			}
		}

		return year;
	}

	static boolean isLeapYear(int jahr) {

		boolean schaltjahr;

		if ((jahr % 4) == 0)
			if ((jahr % 100) == 0)
				if ((jahr % 400) == 0)
					schaltjahr = true;
				else
					schaltjahr = false;
			else
				schaltjahr = true;
		else
			schaltjahr = false;

		return schaltjahr;
	}

}
