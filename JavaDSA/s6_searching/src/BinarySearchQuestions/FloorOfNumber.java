package BinarySearchQuestions;

public class FloorOfNumber {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 15;
		System.out.println("Ceiling of a number is: "+searchFN(arr, target)+" at index: "+searchFI(arr, target));

	}
	
	static int searchFI(int[] arr, int target) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target==arr[mid]) {
				return mid;
			} else if(target>arr[mid]) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		if (end==-1) {
			return -1;
		}
		return end;
	}
	
	static int searchFN(int[] arr, int target) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target==arr[mid]) {
				return arr[mid];
			} else if(target>arr[mid]) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		if (end==-1) {
			return -1;
		}
		return arr[end];
	}

}
