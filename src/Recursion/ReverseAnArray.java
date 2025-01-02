package Recursion;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		//using2Variables(arr,0,arr.length-1);
		using1Variable(arr,0);
		for(int a: arr) {
			System.out.print(a+" ");
		}


	}

	private static void using2Variables(int[] arr, int i, int j) {

		if(i>=j) {
			return;
		}
		swap(arr, i,j);
		using2Variables(arr,i+1,j-1);

	}

	private static void using1Variable(int[] arr, int i) {

		if(i>=arr.length/2) {
			return;
		}
		swap(arr, i,arr.length-i-1);
		using1Variable(arr,i+1);

	}




	public static void swap(int[] arr, int i,int j) {

		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}

}
