package Recursion;

public class Palindrome {

	public static void main(String[] args) {

		String s="madsm";
		System.out.println(function(s,0));

	}

	private static boolean function(String s,int i) {
		
		if(i>=s.length()/2) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		return function(s,i+1);
		
	}

}
