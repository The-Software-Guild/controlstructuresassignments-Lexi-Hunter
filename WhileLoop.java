import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");

		int userInt = sc.nextInt();
		
		sc.close();
		int numLength = (int)Math.log10(userInt) + 1;
		
		int[] placeValues = new int[numLength];
		
		int temp = userInt;
		
		for(int i = 0; i < numLength; i++) {
			placeValues[i] = temp % 10;
			temp /= 10;
		}
		
		boolean isPalindrome = true;
		
		for(int i = 0; i < numLength/2; i++) {
			if(placeValues[i] != placeValues[numLength - i - 1]) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println(userInt + " is a palindrome!");
		}else {
			System.out.println(userInt + " is not a palindrome!");
		}
	}
}
