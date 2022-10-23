package LinearSearch;

public class findMin {

	public static void main(String[] args) {
		int[] arr = {18, 12, 3, -7, 14, 28};
		
		System.out.println("Min value in the array is: "+min(arr));

	}
	
	static int min(int[] arr) {
		int ans = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<ans)
				ans = arr[i];
		}
		
		return ans;
	}

}
