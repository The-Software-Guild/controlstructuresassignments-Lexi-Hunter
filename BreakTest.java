
public class BreakTest {

	public static boolean isPrime(int x) {
		if(x == 1) {
			return false;
		}else if(x == 2) {
			return true;
		}
		
		for(int i = 2; i < Math.sqrt(x)+1; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("There are " + count + " primes between 1 and 100");
	}

}
