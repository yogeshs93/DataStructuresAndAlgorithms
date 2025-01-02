package Recursion;

public class Print1toNBackTracking {

	public static void main(String[] args) {

		int num=5;
		function(num,num);

	}

	private static void function(int i, int num) {
		if(i<1) {
			return;
		}
		function(i-1,num);
		System.out.println(i);
		
	}

}
