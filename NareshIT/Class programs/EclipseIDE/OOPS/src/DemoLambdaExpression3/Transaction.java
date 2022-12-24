package DemoLambdaExpression3;

public interface Transaction {
	public static final Balance b = new Balance();//reference_variable
	public abstract void process(int amt);

}
