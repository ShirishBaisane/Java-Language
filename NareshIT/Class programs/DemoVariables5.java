class  DemoVariables5
{
	int a=15;
	int b=23;
	int c=59;
	//intance variables created
	public static void main(String[] args) 
	{
		DemoVariables5 ob1 = new DemoVariables5();
		DemoVariables5 ob2 = new DemoVariables5();
		DemoVariables5 ob3 = new DemoVariables5();
		//obejects created
		int sum = ob1.a+ob2.b+ob3.c;
		System.out.println("The value of a:"+ob1.a);
		System.out.println("The value of b:"+ob1.b);
		System.out.println("The value of c:"+ob1.c);
		System.out.println("The sum of a,b&c:"+sum);

	}
}
