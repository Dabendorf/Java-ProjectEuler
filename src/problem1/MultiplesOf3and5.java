package problem1;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		int summe = 0;
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				summe += i;
			}
		}
		System.out.println(summe);
	}
	//Antwort: 233168
}