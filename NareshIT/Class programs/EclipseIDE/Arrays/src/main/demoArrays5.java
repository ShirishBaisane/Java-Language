package main;

public class demoArrays5 {

	public static void main(String[] args) {
		Integer a1[] = {1,2,3};
		Integer a2[] = {11,12,13,14};
		Integer a3[] = {111,121,131,141};
		Integer a4[] = {112,122,132,142,152};
		
		Integer a[][] = {a1,a2,a3,a4};
		System.out.println("===Display from Jagged-array===");
		int x=1;
		for(Integer i[]:a) {
			System.out.println("Array: a"+x);
			for(Integer j:i) {
				System.out.print(j.toString()+" ");
			}//InnerLoop
			x++;
			System.out.println();
		}//OuterLoop

	}

}
