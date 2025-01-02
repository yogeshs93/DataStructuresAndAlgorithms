package Recursion;

public class printN1Numbers {

	public static void main(String[] args) {
		
		int num=4;
		function(num,num);

	}

	private static void function(int i, int num) {
		
		if(i<1) {
			return;
		}
		System.out.println(i);
		function(i-1,num);
	}

}
