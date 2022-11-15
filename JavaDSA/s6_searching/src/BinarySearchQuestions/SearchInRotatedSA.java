package BinarySearchQuestions;

public class SearchInRotatedSA {

	public static void main(String[] args) {
		int[] arr = {4,5,6,0,1,2,3};
		int target = 5;
		System.out.println("Pivot element Index is: "+findPivot(arr));
		System.out.println("Index of target element "+target+" is: "+searchInRSA(arr, target));

	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
			while(start<=end) {
			int mid = start + (end-start)/2;
			if(target<arr[mid]) {
				end = mid-1;
			}
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int findPivot(int[] arr) {
		int start = 0, end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>arr[mid+1] && mid<end) {
				return mid;
			}
			if(arr[mid]<arr[mid-1] && mid>start) {
				return mid-1;
			}
			if(arr[start]>=arr[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	static int searchInRSA(int[] arr, int target) {
		int pivot = findPivot(arr);
		if(pivot==-1) {
			return binarySearch(arr, target, 0, arr.length-1);
		}
		if(arr[pivot]==target) {
			return pivot;
		}
		if(target>=arr[0]) {
			return binarySearch(arr, target, 0, pivot-1);
		}
		return binarySearch(arr, target, pivot+1, arr.length-1);
	}
	
	

}
