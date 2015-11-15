package xproblem50;

import java.util.ArrayList;

public class ConsecutivePrimeSum {

	private int tempPruefzahl = 1;
	
	public static void main(String[] args) {
		ConsecutivePrimeSum cps = new ConsecutivePrimeSum();
		ArrayList<Integer> prim = new ArrayList<Integer>();
		while(cps.tempPruefzahl<1000000) {
			prim.add(cps.naechstePruefzahl());
		}
		System.out.println(prim);
	}
	
	private int naechstePruefzahl() {
		boolean prim = false;
		while(prim==false) {
			if(tempPruefzahl==1||tempPruefzahl==2) {
				tempPruefzahl++;
				prim = true;
			} else {
				tempPruefzahl+=2;
				boolean primtemp = true;
				for(int n=3;n<=Math.sqrt(tempPruefzahl);n+=2) {
					if(tempPruefzahl%n == 0) {
						primtemp = false;
						break;
					}
				}
				if(primtemp==true) {
					prim=true;
				}
			}
		}
		return tempPruefzahl;
	}
	//Antwort: 
}