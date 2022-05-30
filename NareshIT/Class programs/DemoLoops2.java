/* 
WAP to display the Factorial of og given number.
*/
import java.util.Scanner;

public class DemoLoops2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("**Factorial!**");
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		int fact = 1;
		if(num>0){
			for(int i=1; i<=num; i++){
			fact*=i;
			}//end of loop
		}//end of if
		else{
			System.out.println("Invalid input");
		}
		System.out.println("Factorial: "+fact);
		s.close();
	}
}