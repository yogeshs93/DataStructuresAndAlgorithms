package BasicMaths;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println(reverseNumber(1234));

	}

	private static int reverseNumber(int num) {
		
		int reverse=0;
		while(num>0) {
			int lastDigit = num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		return reverse;
	}

}
