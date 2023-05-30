
public class DoWhileLoop {

	public static void main(String[] args) {
		
		int n0 = 1;
		int n1 = 1;
		int temp;
		int count = 0;
		
		System.out.println("1\n1");
		do{
			temp = n0 + n1;
			System.out.println(temp);
			
			n0 = n1;
			n1 = temp;
			count ++;
		}while(count < 8);

	}

}
