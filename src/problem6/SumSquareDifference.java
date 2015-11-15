package problem6;

public class SumSquareDifference {

	public static void main(String[] args) {
		int summe = 0;
		int quadrat = 0;
		for(int i=1;i<101;i++) {
			summe += (i*i);
			quadrat += i;
		}
		System.out.println(quadrat*quadrat-summe);
	}
	//Antwort: 25164150
}