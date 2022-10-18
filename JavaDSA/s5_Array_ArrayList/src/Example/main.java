package Example;

public class main {

	public static void main(String[] args) {
		//Syntax
		/*
		 datatype[] variable_name = new datatype[size];
		 
		 int[] rnos = new int[10];
		 		or
		 int[] rnos = {23, 1, 6, 7, 9, 45, 76, 55, 77, 30};
		 */
		
		int[] rnos; //declaration of array
		rnos = new int[10];//initialization
		rnos[0] = 45;
		System.out.println(rnos[0]);
		
		String[] ar = new String[4];
		System.out.println(ar[0]);

	}

}
