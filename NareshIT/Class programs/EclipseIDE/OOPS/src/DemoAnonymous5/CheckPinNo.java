package DemoAnonymous5;

public class CheckPinNo {
	public boolean k = false;
	public boolean verify(int pinNo) {
		if(pinNo==1111 || pinNo==2222 || pinNo==3333) {
			k = true;
		}
		return k;
	}

}
