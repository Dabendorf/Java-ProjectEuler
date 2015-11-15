package problem47;

import java.util.ArrayList;

public class DistinctPrimesFactors {

	private int faktor;
	private int restwert;
	private int tempPruefzahl = 1;
	private ArrayList<Integer> primzahlen = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		new DistinctPrimesFactors().eingabe();
	}
	
	private void eingabe() {
		int zaehler = 0;
		for(int i=0;i<1000000;i++) {
			primzahlen.clear();
			tempPruefzahl = 1;
			faktorenBestimmen(i);
			ArrayList<Integer> primzahlen2 = new ArrayList<Integer>();
			for(int n:primzahlen) {
				if(!primzahlen2.contains(n)) {
					primzahlen2.add(n);
				}
			}
			if(primzahlen2.size()==4) {
				zaehler++;
			} else {
				zaehler = 0;
			}
			System.out.println(i+","+primzahlen2);
			if(zaehler==4) {
				System.out.println("Lösung: "+(i-3));
				break;
			}
		}
	}
	
	private void faktorenBestimmen(int zahl) {
		faktor = naechstePruefzahl();
		restwert = zahl;
		while(2*faktor <= restwert) {
			if(restwert%faktor==0) {
				primzahlen.add(faktor);
				restwert /= faktor;
			} else {
				faktor = naechstePruefzahl();
			}
		}
		primzahlen.add(restwert);
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
	//Antwort: 134043
}