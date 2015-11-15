package problem5;

public class SmallestMultiple {

	public static void main(String[] args) {
		b:for(long i=1;i<10000000000L;i++) {
			long sum = 0;
			for(long t=1;t<21;t++) {
				if(i%t==0L) {
					sum++;
				}
			}
			if(sum==20L) {
				System.out.println(i);
				break b;
			}
		}
		System.out.println("Ende");
	}
	//Antwort: 232792560
}