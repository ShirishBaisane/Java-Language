package Example;

public class ColNoFixed {

	public static void main(String[] args) {
		int[][] arr = {
			{1, 2, 3, 4},
			{21, 15},
			{7, 8, 9}
			
		};
		
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				System.out.println(arr[row][col]);
			}
			System.out.println();
		}

	}

}