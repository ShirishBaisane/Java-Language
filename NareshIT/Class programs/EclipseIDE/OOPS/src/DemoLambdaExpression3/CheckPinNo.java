package DemoLambdaExpression3;

public class CheckPinNo {
	public boolean k = false;
	public boolean verify(int pN) {
		if(pN==1111 || pN==2222 || pN==3333) {
			k = true;
		}
		return k;
	}

}
