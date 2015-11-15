package problem43;

import java.util.ArrayList;
import java.util.Collections;

public class SubStringDivisibility {

	public static void main(String[] args) {
		SubStringDivisibility ssd = new SubStringDivisibility();
		String zahlstring = "9876543210";
		ArrayList<String> zahlen = ssd.permutation(zahlstring);
		Collections.sort(zahlen);
		long summe = 0;
		for(String s:zahlen) {
			long a = Long.valueOf(s);
			System.out.println(a);
			int num2 = ssd.gibZiffer(a,1);
			int num3 = ssd.gibZiffer(a,2);
			int num4 = ssd.gibZiffer(a,3);
			int num5 = ssd.gibZiffer(a,4);
			int num6 = ssd.gibZiffer(a,5);
			int num7 = ssd.gibZiffer(a,6);
			int num8 = ssd.gibZiffer(a,7);
			int num9 = ssd.gibZiffer(a,8);
			int num10 = ssd.gibZiffer(a,9);
			if((100*num2+10*num3+num4)%2==0) {
				if((100*num3+10*num4+num5)%3==0) {
					if((100*num4+10*num5+num6)%5==0) {
						if((100*num5+10*num6+num7)%7==0) {
							if((100*num6+10*num7+num8)%11==0) {
								if((100*num7+10*num8+num9)%13==0) {
									if((100*num8+10*num9+num10)%17==0) {
										summe += a;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(summe);
	}
	
	private ArrayList<String> permutation(String str) {
		ArrayList<String> ausgabe = new ArrayList<String>();
		if(str == null) {
			return null;
		} else if(str.length()==0) {
			ausgabe.add("");
			return ausgabe;
		}
		char charNull = str.charAt(0);
		String rem = str.substring(1);
		ArrayList<String> zeichenketten = permutation(rem);
		for(String strTemp:zeichenketten) {
			for(int i=0;i<=strTemp.length();i++) {
				ausgabe.add(charAdd(strTemp,charNull,i));
			}
		}
		return ausgabe;
	}
 
	private String charAdd(String str,char c, int j) {
		String first = str.substring(0,j);
		String last = str.substring(j);
		return first + c + last;
	}
	
	private int gibZiffer(long a,int stelle) {
		try {
			String temp = Long.toString(a);
			return Character.getNumericValue(temp.charAt(stelle));
		} catch (StringIndexOutOfBoundsException e) {
			return -5;
		}
	}
	//Antwort: 16695334890
}