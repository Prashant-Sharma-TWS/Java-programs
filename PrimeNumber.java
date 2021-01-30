
public class PrimeNumber{ 
	
	static void checkPrime(int n) {
		int flag = 1;
		
		if(n == 0 || n == 1) {
			System.out.println(n + "is not a prime number");
		}
		else {
			for(int i=2;i<n;i++) {
				if((n%i)==0) {
					flag = 0;
				}
			}
			if(flag ==0) {
				System.out.println(n + " " + "is not a prime number");
			}
			else {
				System.out.println(n + " " + "is a prime number");
			}
		}
	}

	public static void main(String args[]){    
		checkPrime(14);
	}    
}   