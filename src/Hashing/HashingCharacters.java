package Hashing;

public class HashingCharacters {

	public static void main(String[] args) {
		
		String str = "abcababac";
		function(str);
		System.out.println(arr[2]);

	}
	static int arr[]=new int[25];

	private static void function(String str) {

		for(int i=0;i<=str.length()-1;i++) {
			int a = str.charAt(i)-'a';
			arr[a]+=1;
		}
		
	}

}
