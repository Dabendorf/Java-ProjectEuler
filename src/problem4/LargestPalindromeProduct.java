package problem4;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		new LargestPalindromeProduct().eingabe();
	}
	
	private void eingabe() {
		int produkt = 0;
		for(int a=100;a<1000;a++) {
			for(int b=100;b<1000;b++) {
				int tempprodukt = a * b;
				if(tempprodukt==spiegeln(tempprodukt) && tempprodukt > produkt) {
					produkt = tempprodukt;
				}
			}
		}
		System.out.println(produkt);
	}
	
	private int spiegeln(int a) {
	    int rev = 0;
	    while(a != 0){
	        rev = rev*10 + a%10;
	        a = a/10;
	    }
	    return rev;
	}
	//Antwort: 906609
}