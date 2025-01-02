package Recursion;

public class Factorial {

	public static void main(String[] args) {

		int num=5;
		factorialUsingParameters(num,1);

	}

	private static int factorialUsingFunction(int num) {

		if(num==1) {
			return 1;
		}
		return num*factorialUsingFunction(num-1);
	}

	private static void factorialUsingParameters(int num,int ans) {

		if(num<1) {
			System.out.println(ans);
			return;
		}
		factorialUsingParameters(num-1,ans*num);
		
	}



}
