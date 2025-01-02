package Recursion;

public class sumusingParameters {

	public static void main(String[] args) {


		int num=3;
		function(num,0);

	}

	private static void function(int num, int sum) {
		if(num<1) {
			System.out.println(sum);
			return;
		}
		function(num-1,sum+num);
		
	}

}
