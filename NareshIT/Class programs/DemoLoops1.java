//WAP to display numbers from 1 to n using loop

import java.util.Scanner;

public class DemoLoops1{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to display numbers:");
		int n = s.nextInt();
		if(n>0){
			for(int i=1; i<=n; i++){
			System.out.print(i+"\t");
			}//end of loop
		}//end of if 
		else {
			System.out.println("Invalid input");
		}
		
		s.close();
	}
}