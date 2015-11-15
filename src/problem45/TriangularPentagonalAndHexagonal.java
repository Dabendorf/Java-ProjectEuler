package problem45;

import java.util.ArrayList;

public class TriangularPentagonalAndHexagonal {

	public static void main(String[] args) {
		ArrayList<Long> triangle = new ArrayList<Long>();
		ArrayList<Long> pentagonal = new ArrayList<Long>();
		ArrayList<Long> hexagonal = new ArrayList<Long>();
		long x=100000000;
		for(long n=144;n<x;n++) {
			long temp1 = n*(n+1)/2;
			triangle.add(temp1);
			long temp2 = n*(3*n-1)/2;
			pentagonal.add(temp2);
			long temp3 = n*(2*n-1);
			hexagonal.add(temp3);
			System.out.println(n);
		}
		for(Long i:triangle) {
			if(pentagonal.contains(i) && hexagonal.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	//Antwort: 1533776805
}