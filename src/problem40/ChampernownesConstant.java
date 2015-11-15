package problem40;

public class ChampernownesConstant {

	public static void main(String[] args) {
		String champZahl = "";
		for(int i=0;i<200000;i++) {
			champZahl += i;
		}
		int product = Character.getNumericValue(champZahl.charAt(1));
		product *= Character.getNumericValue(champZahl.charAt(10));
		product *= Character.getNumericValue(champZahl.charAt(100));
		product *= Character.getNumericValue(champZahl.charAt(1000));
		product *= Character.getNumericValue(champZahl.charAt(10000));
		product *= Character.getNumericValue(champZahl.charAt(100000));
		product *= Character.getNumericValue(champZahl.charAt(1000000));
		System.out.println(product);
	}
	//Antwort: 210
}