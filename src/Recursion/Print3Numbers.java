package Recursion;

public class Print3Numbers {

	public static void main(String[] args) {
		
		function();
	}
	static int count=0;
	public static void function() {
		 
		if(count==3) {
			return;
		}
		System.out.println(count);
		count++;
		function();
		
		
	}

}
