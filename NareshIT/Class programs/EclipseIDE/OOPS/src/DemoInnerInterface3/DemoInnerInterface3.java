package DemoInnerInterface3;

public class DemoInnerInterface3 {

	public static void main(String[] args) {
		AClass.ITest1 ob1 = (int x) ->
							{
								System.out.println("===m1(x)===");
								System.out.println("x: "+x);
							};
		ob1.m1(111);
		
		AClass.ITest2 ob2 = (int y) ->
							{
								System.out.println("===m2(y)===");
								System.out.println("y: "+y);
							};
		ob2.m2(222);

	}

}
