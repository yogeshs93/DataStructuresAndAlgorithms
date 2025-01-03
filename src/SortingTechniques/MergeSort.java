package SortingTechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	//T.C=o(NLog2N)
    //S.C=O(N)

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,7,5,1};
		mergeSort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr,int low,int high) {
		
		if(low>=high) return;
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr, mid+1, high);
		merge(arr,low,mid,high);
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		
		List<Integer> ls = new ArrayList<Integer>();
		
		int left=low;
		int right=mid+1;
		
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				ls.add(arr[left]);
				left++;
			}
			else {
				ls.add(arr[right]);
				right++;
			}
		}
		
		while(left<=mid) {
			ls.add(arr[left]);
			left++;
		}
		
		while(right<=high) {
			ls.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i]=ls.get(i-low);
		}
		
		
	}

}
