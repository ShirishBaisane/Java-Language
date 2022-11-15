package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-18, -15, -7, -6, -2, 0, 2, 5, 6, 7, 10, 11, 17, 21, 45};
		int target = 21;
		int ans = binarySearch(arr, target);
		System.out.println("Index of "+target+" is: "+ans);

	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			//find the mid-element
			//int mid = (start+end)/2; //might be possible that the addition migth get out of range id int
			int mid = start + (end-start)/2;
			if(target<arr[mid]) {
				end = mid-1;
			}
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				//ans found
				return mid;
			}
		}
		return -1;
	}

}
