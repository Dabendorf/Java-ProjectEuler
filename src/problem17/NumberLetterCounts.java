package problem17;

public class NumberLetterCounts {
	
	private String[] einer = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private String[] zehnbiszwanzig = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private String[] zehner = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) {
		NumberLetterCounts nlc = new NumberLetterCounts();
		int summe = 0;
		for(int i=1;i<1001;i++) {
			summe += nlc.wortUmwandeln(i).length();
		}
		System.out.println(Integer.toString(summe));
	}
	
	private String wortUmwandeln(int n) {
		if(n < 100) {
			return bis100(n);
		} else {
			String zahl = "";
			if(n==1000) {
				zahl += bis100(n/1000) + "thousand";
			}
			if(n/100%10!=0) {
				zahl += einer[n/100%10] + "hundred";
			}
			String temp;
			if(n%100!=0) {
				temp = "and" + bis100(n%100);
			} else {
				temp = "";
			}
			return zahl + temp;
		}
	}
	
	private String bis100(int n) {
		if (n < 10) {
			return einer[n];
		} else if (n < 20) {
			return zehnbiszwanzig[n - 10];
		} else {
			String temp;
			if(n%10!=0) {
				temp = einer[n%10];
			} else {
				temp = "";
			}
			return zehner[n/10-2] + temp;
		}
	}
	//Antwort: 21124
}