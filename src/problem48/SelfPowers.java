package problem48;

import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		BigInteger summe = new BigInteger("0");
		for(int i=1;i<1001;i++) {
			BigInteger num = new BigInteger(i+"");
			BigInteger temp = num.pow(i);
			summe = summe.add(temp);
		}
		String summestr = summe.toString();
		int laenge = summestr.length();
		for(int i=laenge-10;i<laenge;i++) {
			System.out.print(Character.getNumericValue(summestr.charAt(i)));
		}
	}
	//Antwort: 9110846700
}