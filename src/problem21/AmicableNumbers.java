package problem21;

public class AmicableNumbers {

	public static void main(String[] args) {
		AmicableNumbers am = new AmicableNumbers();
		int summe = 0;
		for(int a=1;a<10000;a++) {
			System.out.println(a);
			for(int b=1;b<10000;b++) {
				if(a!=b) {
					if(am.teilersumme(a)==b && am.teilersumme(b)==a) {
						summe += a;
					}
				}
			}
		}
		System.out.println(summe);
	}
	
	private int teilersumme(int zahl) {
		int summe = 0;
		for(int i=1;i<zahl;i++) {
			if(zahl%i==0) {
				summe += i;
			}
		}
		return summe;
	}
	//Antwort: 31626
}