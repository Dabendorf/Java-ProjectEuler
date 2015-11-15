package problem41;

public class PandigitalPrime {
	
	public static void main(String[] args) {
		PandigitalPrime pp = new PandigitalPrime();
		long gpz = 0;
		long n = 7654321L;
		for(int i=1234567;i<n;i+=2) {
			System.out.println(i);
			if(pp.istPandigital(i) && i>gpz) {
				if(pp.istPrimzahl(i)) {
					gpz = i;
				}
			}
		}
		System.out.println("Antwort: "+gpz);
	}
	
	private boolean istPandigital(int num){
	    for(int i=1;i<=String.valueOf(num).length();i++){
	        if(!(num+"").contains(i+""))
	            return false;
	    }
	    return true;
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
				for(long n=3; n<=Math.sqrt(zahl); n+=2) {
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
	//Antwort: 7652413
}