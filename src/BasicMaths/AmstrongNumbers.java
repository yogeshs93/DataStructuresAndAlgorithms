package BasicMaths;

public class AmstrongNumbers {

	public static void main(String[] args) {
		
		amstrong(371);

	}

	private static void amstrong(int num) {
		
		int sum=0;
		int temp=num;
		while(num>0) {
			int lastDigit=num%10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("not a Amstrong");
		}
		
	}

}
