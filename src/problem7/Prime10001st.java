package problem7;

public class Prime10001st {

	int zaehler = 0;
	
	public static void main(String[] args) {
		new Prime10001st().eingabe();
	}
	
	private void eingabe() {
		for(int i=0;i<1000000;i++) {
			if(istPrimzahl(i)) {
				zaehler++;
			}
			if(zaehler==10001) {
				System.out.println(i);
				break;
			}
		}
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
	//Antwort: 104743
}