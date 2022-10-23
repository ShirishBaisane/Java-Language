package LinearSearch;

public class main {

	public static void main(String[] args) {
		int[] nums = {23, 45, 1, 2, 3, 8, 19, -3, 16, -11, 28};
		int target = 19;
		
		int ans1 = linearSearch1(nums, target);
		System.out.println("Index of target element is: "+ans1);
		
		int ans2 = linearSearch2(nums, target);
		if(ans2==Integer.MIN_VALUE) {
			System.out.println("Array size is zero");
		}
		else if(ans2==Integer.MAX_VALUE) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Target element is: "+ans2);
		}
		
		boolean ans3 = linearSearch3(nums, target);
		System.out.println("Is the target element found: "+ans3);
	}
	
	//search in the Array: return the index if item is found
	static int linearSearch1(int[] arr, int target) {
		if(arr.length==0)
			return -1;
		
		for(int index=0; index<arr.length; index++) {
			int element = arr[index];
			if(element==target) {
				return index;
			}
		}
		return -1;
	}
	
	//search the target and return the element
	static int linearSearch2(int[] arr, int target) {
		if(arr.length==0)
			return Integer.MIN_VALUE;
		
		for(int element: arr) {
			if(element==target) {
				return element;
			}
		}
		return Integer.MAX_VALUE;
		
	}
	
	static boolean linearSearch3(int[] arr, int target) {
		if(arr.length==0)
			return false;
		for(int element: arr) {
			if(element==target) {
				return true;
			}
		}
		return false;
	}

}
