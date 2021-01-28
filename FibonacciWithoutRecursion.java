
public class FibonacciWithoutRecursion {
	public static void main(String[] args) {
		int a=0, b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0; i <= 5; i++) {
			int num = a+b;
			System.out.println(num);
			
			a = b;
			b = num;
		}
	}
}
