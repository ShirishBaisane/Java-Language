/*
W.A.P. to display Even number or Odd number from 1 to n based on  
*/

import java.util.Scanner;

class Even {
	void evenNo(int n){
		System.out.println("***Even numbers upto n:***");
		for(int i=1; i<=n; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}//end of if
		}//end of loop
	}
	
}//SubClass

class Odd {
	void oddNo(int n){
		System.out.println("***Odd numbers upto n:***");
		for(int i=1; i<=n; i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}// end of if
		}//end of loop
	}
	
}//SubClass

public class DemoLoops3{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number upto which you want to display Even/Odd numbers:");
		int num = s.nextInt();
		System.out.println("Enter a choice:\n1.Even\n2.Odd");
		int choice = s.nextInt();
		switch(choice){
			case 1:
				Even e = new Even();
				e.evenNo(num);
				break;
			case 2:
				Odd o = new Odd();
				o.oddNo(num);
				break;
			default:
				System.out.println("Invalid Choice!!!");
		}//end of switch
		s.close();
	}
}//MainClass