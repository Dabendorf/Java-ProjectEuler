package problem50;

public class ConsecutivePrimeSum {

	public ConsecutivePrimeSum() {
		int beginnerPrimeNumber = 1;
		int sum = 0;
		int numOfPrimes = 0;
		
		while(beginnerPrimeNumber<1000000) {
			int actPrimeNumber = beginnerPrimeNumber;
			beginnerPrimeNumber = nextPrime(beginnerPrimeNumber);
			
			int sumTemp = 0;
			int numOfPrimesTemp = 0;
			
			while(sumTemp+nextPrime(actPrimeNumber) < 1000000) {
				actPrimeNumber = nextPrime(actPrimeNumber);
				sumTemp += actPrimeNumber;
				numOfPrimesTemp += 1;
			}
			
			if(numOfPrimesTemp > numOfPrimes && isPrime(sumTemp)) {
                numOfPrimes = numOfPrimesTemp;
                sum = sumTemp;
            }
		}
		
		System.out.println(sum);
		System.out.println(numOfPrimes);
	}
	
	private int nextPrime(int tempPrimevar) {
		boolean prim = false;
		while(prim==false) {
			if(tempPrimevar==1||tempPrimevar==2) {
				tempPrimevar++;
				prim = true;
			} else {
				tempPrimevar+=2;
				boolean primtemp = true;
				for(int n=3;n<=Math.sqrt(tempPrimevar);n+=2) {
					if(tempPrimevar%n == 0) {
						primtemp = false;
						break;
					}
				}
				if(primtemp==true) {
					prim=true;
				}
			}
		}
		return tempPrimevar;
	}
	
	private boolean isPrime(int prime) {
		if(prime<2) {
			return false;
		} else if(prime==2) {
			return true;
		} else if(prime%2==0) {
			return false;
		} else {
			boolean primeBool = true;
			for(int n=3;n<=Math.sqrt(prime);n+=2) {
				if(prime%n==0) {
					primeBool = false;
					break;
				}
			}
			return primeBool;
		}
	}
	
	public static void main(String[] args) {
		new ConsecutivePrimeSum();
	}
	//Antwort: 997651
}