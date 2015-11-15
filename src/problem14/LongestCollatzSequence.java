package problem14;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		int rekordhalterzahl = 0;
		int rekordanzahl = 0;
		for(int i=1;i<1000001;i++) {
			int temp = i;
			int zaehler = 0;
			while(temp!=1) {
				if(temp%2==0) {
					temp /= 2;
				} else {
					temp = temp*3 +1;
				}
				zaehler++;
			}
			if(zaehler>rekordanzahl) {
				rekordanzahl = zaehler;
				rekordhalterzahl = i;			
			}
			System.out.println(i);
		}
		System.out.println("Diese Zahl gewinnt:"+rekordhalterzahl);
		System.out.println("Mit "+rekordanzahl+" Durchgaengen!");
	}
	//Antwort: 837799
}