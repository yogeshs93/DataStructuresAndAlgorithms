package Recursion;

public class PrintNto1BackTracking {

	public static void main(String[] args) {

		int num=5;
		function(1,num);

	}

	private static void function(int i, int num) {
		
		if(i>num) {
			return;
		}
		function(i+1,num);
		System.out.println(i);
		
	}

}
