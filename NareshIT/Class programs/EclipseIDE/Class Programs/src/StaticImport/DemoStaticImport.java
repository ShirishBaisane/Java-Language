package StaticImport;

import java.util.Scanner;
import static java.lang.Math.*;//static import

public class DemoStaticImport {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		double val = s.nextDouble();
		double result = sqrt(val);//method_call
		System.out.println("the SqRt of "+val+" is: "+result);
		s.close();
	}

}
