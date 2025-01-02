package Recursion;

public class SumUsingFunction {

	public static void main(String[] args) {

		int num=5;
		System.out.println(function(num));

	}

	private static int function(int num) {
		
		if(num==0) {
			return 0;
		}
		return num+function(num-1);
		
	}

}
