package DemoInnerInterface1;

public class DemoInnerInterface2 {

	public static void main(String[] args) {
		SubClass.ITest1 ob1 = (int x) ->
								{
									System.out.println("===m1(x)===");
									System.out.println("x: "+x);
								};
		ob1.m1(123);
		
		SubClass.ITest2 ob2 = (int y) ->
								{
									System.out.println("===m2(y)===");
									System.out.println("y: "+y);
								};
		ob2.m2(234);

	}

}
