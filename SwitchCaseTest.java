import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a char: ");
		
		char userChar = sc.nextLine().charAt(0);
		
		sc.close();
		
		switch(userChar) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("The char is a vowel!");
				break;
			default:
				System.out.println("The char is not a vowel!");
				break;
		}
		
	}

}
