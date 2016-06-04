package problem53;

import java.math.BigInteger;

public class CombinatoricSelections {
	
	public CombinatoricSelections() {
		int counter = 0;
		
		for(int n=1;n<=100;n++) {
			for(int k=0;k<=n;k++) {
				BigInteger bin = factorial(n);
				BigInteger temp = factorial(k);
				temp = temp.multiply(factorial(n-k));
				bin = bin.divide(temp);
				if(bin.compareTo(BigInteger.valueOf(1000000))==1) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
	
	private BigInteger factorial(int num) {
		BigInteger product = new BigInteger("1");
		if(num > 1) {
			for(int i=2;i<=num;i++) {
				product = product.multiply(BigInteger.valueOf(i));
			}
		}
		return product;
	}

	public static void main(String[] args) {
		new CombinatoricSelections();
	}
	//Antwort: 4075
}