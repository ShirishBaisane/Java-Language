package DesignApp1;

public class Demodesign1 {

	public static void main(String[] args) {
		ITest ob = Access.getRef();//Accessing the InnerClass object reference
		//Accessing the implementation class object reference
		ob.m(123);

	}

}
