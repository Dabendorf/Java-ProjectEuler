package problem29;

import java.util.ArrayList;

public class DistinctPowers {

	public static void main(String[] args) {
		ArrayList<Double> zahlen = new ArrayList<Double>();
		for(int a=2;a<101;a++) {
			for(int b=2;b<101;b++) {
				double temp = Math.pow(a,b);
				if(!zahlen.contains(temp)) {
					zahlen.add(temp);
				}
			}
		}
		System.out.println(zahlen.size());
	}
	//Antwort: 9183
}