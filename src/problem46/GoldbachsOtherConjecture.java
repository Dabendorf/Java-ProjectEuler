package problem46;

import java.util.ArrayList;

public class GoldbachsOtherConjecture {

	public static void main(String[] args) {
		GoldbachsOtherConjecture goc = new GoldbachsOtherConjecture();
		ArrayList<Integer> primzahlen = new ArrayList<Integer>();
		for(int i=0;i<10000;i++) {
			if(goc.istPrimzahl(i)) {
				primzahlen.add(i);
			}
		}
		int result = 1;
		boolean notFound = true;
		 
		while(notFound){
		    result += 2;
		 
		    int j = 0;
		    notFound = false;
		    while (result >= primzahlen.get(j)) {
		        if(goc.istDoppelQuadrat(result-primzahlen.get(j))){
		            notFound = true;
		            break;
		        }
		        j++;
		    }
		}
		System.out.println(result);
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
	
	private boolean istDoppelQuadrat(int num) {
		double temp = Math.sqrt(num/2);
		return (temp == (int)temp);
	}
	//Antwort: 5777
}