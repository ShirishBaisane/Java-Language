package LinearSearch;

public class searchInRange {

	public static void main(String[] args) {
		int[] arr = {18, 12, 3, -7, 14, 28};
		int target = 3;
		
		System.out.println("Index of target element "+target+" in the range(1,4) is: "+linearSearch(arr, target, 1, 4));

	}
	
	static int linearSearch(int[] arr, int target, int start, int end) {
		if(arr.length==0)
			return -1;
		
		for(int i=start; i<=end; i++) {
			int ele = arr[i];
			if(ele==target)
				return i;
		}
		
		return -1;
	}

}
