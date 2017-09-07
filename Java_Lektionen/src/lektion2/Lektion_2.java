/**
 * 
 */
package lektion2;

/**
 * @author vmadmin
 *
 */
public class Lektion_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anzahlschueler = 23;
		boolean zustandlichtschalter = true;
		double saldo = 20500.30;
		String schachbrettlinie = "A2";
		
		anzahlschueler++;
		zustandlichtschalter = false;
		saldo++;
		schachbrettlinie = "B2";
		
		System.out.println("Anzahl Schüler = " + anzahlschueler);
		System.out.println("Zustand des Lichtschalters = " + zustandlichtschalter);
		System.out.println("Saldo des Bankkontos = " + saldo + " CHF");
		System.out.println("Schachbrettlinie = " + schachbrettlinie);
	}
}
