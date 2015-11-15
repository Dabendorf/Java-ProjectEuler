package problem12;

public class HighlyDivisibleTriangularNumber {
	
	public static void main(String[] args) {
		int sum = 0;
		b:for(int i=1;i<100000000;i++) {
			sum += i;
			int menge = 0;
			for(int t=1;t<=sum;t++) {
				if(sum%t==0) {
					menge++;
				}
			}
			System.out.println("Zahl:"+sum+":Teiler:"+menge);
			if(menge>=500) {
				System.out.println("Gefunden!"+sum);
				break b;
			}
		}
	}
	//Antwort: 76576500
}