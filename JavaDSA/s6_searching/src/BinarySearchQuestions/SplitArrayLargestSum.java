package BinarySearchQuestions;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] arr = {7,2,5,10,8};
		int m = 2;//no. of partition
		System.out.println("The largest sum while spliting the array is: "+splitArray(arr,m));
	}
	
	static int splitArray(int[] nums,int m) {
		int start=0, end=0;
		for(int i=0; i<nums.length; i++){
			start = Math.max(start,  nums[i]);
			end += nums[i];
		}
		//binary search
		while(start<end) {
			//try for the mid element as potential ans
			int mid = start + (end-start)/2;
			//cal how many pieces we can divide this in with the max sum
			int sum=0, pieces=1;
			for(int num: nums) {
				if(sum+num > mid) {
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}
			if(pieces>m) {
				start = mid+1;
			} else {
				end = mid;
			}
		}
		return end;
	}

}
