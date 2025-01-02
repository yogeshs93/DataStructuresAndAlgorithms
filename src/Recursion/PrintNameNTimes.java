package Recursion;

public class PrintNameNTimes {

	public static void main(String[] args) {
		int num=4;
		function(1,num);

	}

	private static void function(int i, int num) {
	
		if(i>num) {
			return;
		}
		System.out.println("Yogesh");
		function(i+1,num);
		
	}

}
