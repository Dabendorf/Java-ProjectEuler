package problem25;

import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {

	public static void main(String[] args) {
		ThousandDigitFibonacciNumber tdfn = new ThousandDigitFibonacciNumber();
		for(int i=1;i<100000;i++) {
			BigInteger temp = tdfn.berechnung(new BigInteger(i+""));
			String tempstr = temp.toString();
			System.out.println(tempstr);
			if(tempstr.length()>=1000) {
				System.out.println("Index: "+(i-1));
				break;
			}
		}
	}
	
	public BigInteger berechnung(BigInteger zahl) {
		BigInteger fibonacci = new BigInteger(1+"");
		BigInteger fibonacci1 = new BigInteger(1+"");
		BigInteger fibonacci2 = new BigInteger(1+"");
		if(zahl.equals(1) || zahl.equals(2)) {
			return new BigInteger(1+"");
		}
		for(BigInteger n = new BigInteger(3+"");n.compareTo(zahl)==-1;n=n.add(new BigInteger(1+""))) {
			fibonacci = fibonacci1.add(fibonacci2);
			fibonacci2 = fibonacci1;
			fibonacci1 = fibonacci;
		}
		return fibonacci;
	}
	//Antwort: 4782
}