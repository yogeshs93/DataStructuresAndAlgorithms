package Recursion;

public class fibonacci {

	public static void main(String[] args) {
		
		int num=4;
		System.out.println(function(num));
		

	}

	private static int function(int num) {
		
		if(num<=1) {
			return num;
		}
		return function(num-1)+function(num-2);
		
	}

}
