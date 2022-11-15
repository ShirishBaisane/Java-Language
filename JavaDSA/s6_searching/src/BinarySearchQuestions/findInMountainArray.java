package BinarySearchQuestions;

public class findInMountainArray {

	public static void main(String[] args) {
		//Mountain Array
		int[] arr = {1,2,7,6,4,3};
		int target = 2;
		System.out.println("Index of target element "+target+" in Mountain arrray is: "+findTarget(arr, target));
	}
	
	static int findTarget(int[] arr, int target) {
		int peak = findPeakIndex(arr);
		int ans=orderAgnosticBS(arr, target, 0, peak);
		if(ans!=-1) {
			return ans;
		}
		return orderAgnosticBS(arr, target, peak+1, arr.length-1);
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
	
	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
        	int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
