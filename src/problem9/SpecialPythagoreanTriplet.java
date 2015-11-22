package problem9;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		schlc:for(int c=1;c<1000;c++) {
			for(int b=1;b<c;b++) {
				int a = 1000 - b -c;
				if(a*a+b*b==c*c) {
					if(a+b+c==1000) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						System.out.println(a*b*c);
						break schlc;
					}
				}
			}
		}
	}
	//Antwort: 31875000
}