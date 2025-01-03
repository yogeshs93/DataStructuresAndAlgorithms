package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
	
	//T.C=o(NLog2N)
    //S.C=O(1)

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,7,5,8};
		quickSort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));
		

	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low<high) {
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i=low;
		int j=high;
		while(i<j) {
			while(arr[i]<=pivot && i<=high-1) {
				i++;
			}
			while(arr[j]>pivot && j>=low+1) {
				j--;
			}
			if(i<j) {
				swap(arr, i, j);
			}
			
		}
		swap(arr, low, j);
		return j;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}

	

}
