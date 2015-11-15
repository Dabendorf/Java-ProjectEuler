package problem20;

import java.math.BigInteger;

public class FactorialDigitSum {

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1");
		for(int i=2;i<101;i++) {
			bi = bi.multiply(new BigInteger(i+""));
		}
		String temp = bi.toString();
		int zaehler = 0;
		for(int i=0;i<temp.length();i++) {
		    zaehler += (int) (temp.charAt(i)-'0');
		}
		System.out.println(zaehler);
	}
	//Antwort: 648
}