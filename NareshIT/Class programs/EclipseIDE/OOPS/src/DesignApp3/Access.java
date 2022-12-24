package DesignApp3;

public class Access {
	public static ITest getRef() {
		//LambdaExpression
		ITest ob = (int x) ->
					{
						System.out.println("==InnerClass m(x)==");
						System.out.println("The value x: "+x);
					};
		return ob;
	}//end_of_method
	
}
