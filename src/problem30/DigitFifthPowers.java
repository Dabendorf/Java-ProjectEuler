package problem30;

import java.util.ArrayList;

public class DigitFifthPowers {

	public static void main(String[] args) {
		int summe = 0;
		for(int i=2;i<1000000;i++) {
			double temp = 0;
			ArrayList<Integer> ziffern = new ArrayList<Integer>();
			int j = i;
			while(j>0) {
				ziffern.add(j%10);
				j /= 10;
			}
			for(Integer a:ziffern) {
				temp += Math.pow(a,5);
			}
			if(temp==i) {
				summe += i;
				System.out.println(i);
			}
		}
		System.out.println("Summe: "+summe);
	}
	//Antwort: 443839
}