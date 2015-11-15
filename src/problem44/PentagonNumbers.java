package problem44;

import java.util.ArrayList;

public class PentagonNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> pentagonal = new ArrayList<Integer>();
		for(int i=1;i<5000;i++) {
			pentagonal.add(i*(3*i-1)/2);
		}
		int mindiff = -1;
		for(int j=0;j<pentagonal.size();j++) {
			System.out.println(j);
			for(int k=0;k<j;k++) {
				int summe = pentagonal.get(j) + pentagonal.get(k);
				int diff = Math.abs(pentagonal.get(j) - pentagonal.get(k));
				if(pentagonal.contains(summe) && pentagonal.contains(diff)) {
					if(mindiff==-1 || mindiff > diff) {
						mindiff = diff;
					}
				}
			}
		}
		System.out.println(mindiff);
	}
	//Antwort: 5482660
}