package problem56;

import java.math.BigInteger;

public class PowerfulDigitSum {

	public static void main(String[] args) {
		PowerfulDigitSum pds = new PowerfulDigitSum();
		long maxsum = 0;
		for(int a=1;a<100;a++) {
			for(int b=1;b<100;b++) {
				BigInteger bi = new BigInteger(a+"").pow(b);
				if(pds.quersumme(bi.toString()) > maxsum) {
					maxsum = pds.quersumme(bi.toString());
				}
			}
		}
		System.out.println(maxsum);
	}
	
	private long quersumme(String str) {
		long summe = 0;
		for(int i=0;i<str.length();i++) {
			char tempchar = str.charAt(i);
			summe += Long.parseLong(String.valueOf(tempchar));
		}
		return summe;
	}
	//Antwort: 972
}