package SortingTechniques;

import java.util.Arrays;

public class InsertionSort {
	
	//T.C=O(N)2
	//Best Case=O(N)

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,7,5,1};
		insertionSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			int j=i;
			while(j>0&&arr[j-1]>arr[j]) {
				swap(arr,j-1,j);
				j--;
			}
		}
		
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}

}
