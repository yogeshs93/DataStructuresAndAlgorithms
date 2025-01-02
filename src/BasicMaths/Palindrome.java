package BasicMaths;

public class Palindrome {

	public static void main(String[] args) {
		
		palindrome(1212);

	}

	private static void palindrome(int num) {
		
		int rev = 0;
		int temp=num;
		while(num>0) {
			int lastDigit = num%10;
			rev=rev*10+lastDigit;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
