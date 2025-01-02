package BasicMaths;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		checkPrimeNumber(23);

	}

	private static void checkPrimeNumber(int num) {
		
		boolean status=true;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				status=false;
				break;
			}
		}
		if(status==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
	}

}
