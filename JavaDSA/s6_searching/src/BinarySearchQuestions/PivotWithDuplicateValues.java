package BinarySearchQuestions;

public class PivotWithDuplicateValues {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,0,1,1,2,3};
		System.out.println(findPivotWithDuplicates(arr));
	}
	
	 static int findPivotWithDuplicates(int[] arr) {
		 int start = 0, end = arr.length-1;
		 while(start<=end) {
			 int mid = start + (end-start)/2;
			 if(arr[mid]>arr[mid+1] && mid<end) {
				 return mid;
			 }
			 if(arr[mid]<arr[mid-1] && mid>start) {
				 return mid-1;
			 }
			 
			 //if elements at start,mid&end are equal then just skip the duplicates
			 if(arr[mid] == arr[start] && arr[mid]== arr[end]) {
				 //skip the duplicates
				 //NOTE: what if these elements at start and end were the pivot???
				 
				 //check if start is pivot
				 if(arr[start]>arr[start+1] && start<end) {
					 return start;
				 }
				 start++;
				 
				 //check if end is pivot
				 if(arr[end]<arr[end-1] && end>start) {
					 return end-1;
				 }
				 end--;
			 }
			 //left side is sorted, so pivot should be in right
			 else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
				 start = mid+1;
			 } else {
				 end = mid-1;
			 }
		 }
		 return -1;
	 }

}
