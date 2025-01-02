package Hashing;

public class HashingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,3,4,2};
		function(arr);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int a: arr1) {
			if(a>max) {
				max=a;
			}
			else if(a<min) {
				min=a;
			}
		}
		System.out.println(min);
		System.out.println(max);

	}
	static int[] arr1 = new int[13];

	private static void function(int[] arr) {
		
		
		for(int i=0;i<=arr.length-1;i++) {
			arr1[arr[i]]+=1;
		}
		
	}

}
