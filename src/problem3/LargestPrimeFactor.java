package problem3;

import java.util.ArrayList;

public class LargestPrimeFactor {

	private long zahl;
	private long faktor;
	private long restwert;
	private long tempPruefzahl = 1;
	private ArrayList<Long> primzahlen = new ArrayList<Long>();
	
	public static void main(String[] args) {
		new LargestPrimeFactor().eingabe();
	}
	
	private void eingabe() {
		zahl = 600851475143L;
		faktorenBestimmen();
		System.out.println(primzahlen);
	}
	
	public void faktorenBestimmen() {
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
	
	private long naechstePruefzahl() {
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
	//Antwort: 6857
}