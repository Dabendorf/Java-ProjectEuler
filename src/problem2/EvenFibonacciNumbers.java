package problem2;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int fibonacci=1, fibonacci1=1, fibonacci2=1;
		System.out.println("Summe:"+sum);
		while(fibonacci<4000000) {
			fibonacci = fibonacci1 + fibonacci2;
			fibonacci2 = fibonacci1;
			fibonacci1 = fibonacci;
			if(fibonacci>4000000) {
				break;
			}
			if(fibonacci%2==0) {
				sum += fibonacci;
				System.out.println(fibonacci);
				System.out.println("Summe:"+sum);
			}
		}
	}
	//Antwort: 4613732
}