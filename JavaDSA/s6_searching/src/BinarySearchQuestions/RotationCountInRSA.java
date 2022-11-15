package BinarySearchQuestions;

public class RotationCountInRSA {

	public static void main(String[] args) {
		int[] arr = {4,5,6,0,1,2,3};
		System.out.println("Ratatin count of the array is: "+countRotation(arr));
	}
	
	static int countRotation(int[] arr) {
		int pivot = findPivot(arr);
		return pivot+1;
	}
	
	static int findPivot(int[] arr) {
		int start=0, end=arr.length-1;
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

}
