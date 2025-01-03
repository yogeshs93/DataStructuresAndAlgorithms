package SortingTechniques;

import java.util.Arrays;

public class BubbleSort {
	
	//T.C: O(N)2

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,7,5,1};
		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			int swap=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
					swap++;
				}
			}
			if(swap==0) {
				break;
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}

}
