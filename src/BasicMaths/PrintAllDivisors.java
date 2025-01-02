package BasicMaths;

public class PrintAllDivisors {

	public static void main(String[] args) {
		
		printDivisors(36);

	}

	private static void printDivisors(int num) {
		for(int i=1;i*i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
			
			if (i != num / i) {
				System.out.println(num/i);
			}
			}
		}
		
	}

}
