import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");

		int userInt = sc.nextInt();
		
		while(userInt < 0) {
			System.out.println("Please make sure your integer is > 0");
			System.out.println("Please enter an integer: ");
			userInt = sc.nextInt();
		}
		
		sc.close();
		
		int result = 1;
		
		for(int i = 2; i <= userInt; i++) {
			result *= i;
		}
		
		System.out.println("The factorial of your integer is " + result);
	}

}
