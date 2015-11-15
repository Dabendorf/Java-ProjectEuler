package problem16;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("2");
		for(int i=0;i<999;i++) {
			bi = bi.multiply(new BigInteger("2"));
		}
		String temp = bi.toString();
		long summe = 0;
		for(int i=0;i<temp.length();i++) {
			char tempchar = temp.charAt(i);
			summe += Integer.parseInt(String.valueOf(tempchar));
		}
		System.out.println(summe);
	}
	//Antwort: 1366
}