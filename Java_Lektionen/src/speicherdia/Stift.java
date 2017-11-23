package speicherdia;

public class Stift {

	private char farbe;
	private boolean gefunden;
	
	public Stift(char f){
		farbe=c;
	}
	
	public void setFarbe (char f){
		farbe=f;
	}
}

class TestStift{
	public static void main (String[] args){
		Stift[] geheimCode = new Stift[3];
		geheimCode[0] = new Stift('S');
		geheimCode[1] = new Stift('W');
		geheimCode[2] = new Stift('R');
		Stift[] testCode = new Stift[3];
		testCode[0] = new Stift('S');
		testCode[1] = new Stift('W');
		testCode[2] = new Stift('R');
		// SPEICHERDIAGRAMM
		// gilt geheimCode == testCode ?
				
	}
}
