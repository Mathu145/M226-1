package lektion3;
public class Lektion_3b {
	public static void main(String[] args) {
		int p = 80;
		int q = 40;
		if (p < q) {
			int temp = p;
			p = q;
			q = temp;
		}
		while (q != 0) {
			int r = p % q;
			p = q;
			q = r;
		}
		System.out.println(p);
	}
}
