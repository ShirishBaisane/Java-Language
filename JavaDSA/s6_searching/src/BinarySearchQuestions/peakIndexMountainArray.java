package BinarySearchQuestions;

public class peakIndexMountainArray {

	public static void main(String[] args) {
		//Mountain Array
		int[] arr = {1,2,7,6,4,2,1};
		System.out.println("Peak int in Mountain arrray is: "+findPeakIndex(arr));;
	}
	
	static int findPeakIndex(int[] arr) {
		 int start=0, end = arr.length-1;
		 while(start<end) {
			 int mid = start + (end-start)/2;
			 if(arr[mid]>arr[mid+1]) {
				 end = mid;
			 }
			 if(arr[mid]<arr[mid+1]) {
				 start = mid+1;
			 }
		 }
		 return start;//same as end
	}

}
