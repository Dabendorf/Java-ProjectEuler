package problem10;

public class SummationOfPrimes {

	private long summe = 0;
	
	public static void main(String[] args) {
		new SummationOfPrimes().eingabe();
	}
	
	private void eingabe() {
		for(int i=0;i<2000000;i++) {
			if(istPrimzahl(i)) {
				summe += i;
				System.out.println(i);
			}
		}
		System.out.println(summe);
	}
	
	private boolean istPrimzahl(long zahl) {
		boolean prim = true;
		if(zahl == 1) {
			prim = false;
		} else if(zahl == 2) {
			prim = true;
		} else {
			if(zahl%2 == 0) {
				prim = false;
			} else {
				for(int n=3; n<=Math.sqrt(zahl); n+=2) {
					if(zahl%n == 0) {
						prim = false;
						break;
					}
				}
			}
		}
		
		if(prim == false) {
			return false;
		} else {
			return true;
		}
	}
	//Antwort: 142913828922
}