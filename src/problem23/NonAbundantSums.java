package problem23;

import java.util.ArrayList;

public class NonAbundantSums {

	public static void main(String[] args) {
		ArrayList<Integer> abundanteZahlen = new ArrayList<Integer>();
		ArrayList<Integer> alleZahlen = new ArrayList<Integer>();
		for(int i=1;i<28124;i++) {
			int summe = 0;
			for(int x=1;x<i;x++) {
				if(i%x==0) {
					summe += x;
				}
			}
			if(summe > i) {
				abundanteZahlen.add(i);
			}
		}
		System.out.println(abundanteZahlen);
		for(int i=1;i<28124;i++) {
			alleZahlen.add(i);
		}
		for(Integer a:abundanteZahlen) {
			System.out.println(a);
			for(Integer b:abundanteZahlen) {
				if(alleZahlen.contains(a+b)) {
					alleZahlen.remove(alleZahlen.indexOf(a+b));
				}
			}
		}
		int summe = 0;
		for(Integer a:alleZahlen) {
			summe += a;
		}
		System.out.println("Summe: "+summe);
		
	}
	//Antwort: 4179871
}