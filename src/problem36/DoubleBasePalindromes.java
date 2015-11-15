package problem36;

public class DoubleBasePalindromes {

	public static void main(String[] args) {
		DoubleBasePalindromes dbp = new DoubleBasePalindromes();
		int summe = 0;
		for(int i=1;i<1000000;i++) {
			if(i==dbp.spiegeln(i)) {
				String bin = Integer.toString(i, 2);
				if(bin.equals(dbp.spiegeln(bin))) {
					summe += i;
				}
			}
		}
		System.out.println(summe);
	}
	
	private int spiegeln(int a) {
	    int rev = 0;
	    while(a != 0){
	        rev = rev*10 + a%10;
	        a = a/10;
	    }
	    return rev;
	}
	
	private String spiegeln(String a) {
	    String temp = "";
	    for(int i=a.length()-1;i>-1;i--) {
	    	temp += a.charAt(i);
	    }
	    return temp;
	}
	//Antwort: 872187
}