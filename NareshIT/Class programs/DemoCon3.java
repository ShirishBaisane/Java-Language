/*
Program on Constructor_with_parameter
*/

class CTest3{
	int y;
	CTest3(int x, int y){
		this.y=y;//initialize_instance_variable"y"
		System.out.println("===Constructor with parameter===");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}//Constructor_with_parameter
}//SubClass

class DemoCon3{
	public static void main(String[]args){
		CTest3 ob = new CTest3(5,7);//Constructor_call
		System.out.println("===Construct initialized variable===");
		System.out.println("y: "+ob.y);//variable_call
	}
}//MainClass