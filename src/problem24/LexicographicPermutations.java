package problem24;

import java.util.ArrayList;
import java.util.Collections;

public class LexicographicPermutations {

	public static void main(String[] args) {
		LexicographicPermutations lp = new LexicographicPermutations();
		lp.sortieren();
	}
	
	private void sortieren() {
		String zahlstring = "0123456789";
		ArrayList<String> zahlen = permutation(zahlstring);
		Collections.sort(zahlen);
		System.out.println(zahlen.get(999999));
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
	//Antwort: 2783915460
}