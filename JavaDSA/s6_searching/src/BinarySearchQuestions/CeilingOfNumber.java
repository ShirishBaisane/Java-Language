package BinarySearchQuestions;

public class CeilingOfNumber {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 15;
		System.out.println("Ceiling of a number is: "+searchCN(arr, target)+" at index: "+searchCI(arr, target));

	}
	
	static int searchCN(int[] arr, int target) {
		int start = 0, end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==target) {
				return arr[mid];
			}
			if(target>arr[mid]) {
				start = mid+1;
			} else if(target<arr[mid]) {
				end = mid-1;
			}
			
		}
		if(start==arr.length) {
			return -1;
		}
		return arr[start];
	}
	
	static int searchCI(int[] arr, int target) {
		int start = 0, end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(target>arr[mid]) {
				start = mid+1;
			} else {
				end = mid-1;
			}
			
		}
		if(start==arr.length) {
			return -1;
		}
		return start;
	}

}
