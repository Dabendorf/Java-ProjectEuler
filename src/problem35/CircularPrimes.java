package problem35;

public class CircularPrimes {

	public static void main(String[] args) {
		CircularPrimes cp = new CircularPrimes();
		int summe = 0;
		for(int n=2;n<1000000;n++) {
			System.out.println(n);
			boolean circular = true;
			int temp = n;
			for(int i=0;i<String.valueOf(n).length()+1;i++) {
				int letzteZahl = temp%10;
				int ausgabe = (int)Math.pow(10,String.valueOf(n).length()-1)*letzteZahl + temp/10;
				temp = ausgabe;
				if(!cp.istPrimzahl(temp)) {
					circular = false;
					break;
				}
			}
			if(circular) {
				summe++;
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
	//Antwort: 55
}