package problem39;

import java.util.ArrayList;

public class IntegerRightTriangles {

	public static void main(String[] args) {
		int zahl = 0;
		int menge = 0;
		for(int um=0;um<1001;um++) {
			System.out.println(um);
			int zaehler = 0;
			ArrayList<String> seitenpaare = new ArrayList<String>();
			for(int a=1;a<um;a++) {
				for(int b=1;b<um;b++) {
					int c = um - a - b;
					int atemp = a;
					int btemp = b;
					if(c>0) {
						if(atemp>c) {
							int temp = atemp;
							atemp = c;
							c = temp;
						}
						if(btemp>c) {
							int temp = btemp;
							btemp = c;
							c = temp;
						}
						if(atemp>btemp) {
							int temp = btemp;
							btemp = atemp;
							atemp = temp;
						}
						if(Math.pow(atemp, 2) + Math.pow(btemp, 2) == Math.pow(c, 2)) {
							String temp = String.valueOf(atemp) + String.valueOf(btemp) + String.valueOf(c);
							if(!seitenpaare.contains(temp)) {
								seitenpaare.add(temp);
								zaehler++;
							}
						}
					}
				}
			}
			if(zaehler>menge) {
				menge = zaehler;
				zahl = um;
			}
		}
		System.out.println("Gesuchte Zahl: "+zahl);
	}
	//Antwort: 840
}