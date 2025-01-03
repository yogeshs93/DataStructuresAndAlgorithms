package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
	
	//T.C: O(n)2

	public static void main(String[] args) {

		int[] arr= {1,4,2,7,5,1};
		selectionSort(arr);

		System.out.println(Arrays.toString(arr));


	}

	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			swap(arr,i,min);
			
		}
		

	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}

}
