package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		System.out.println("===Calculate Average of N numbers====");
		Scanner scan = new Scanner(System.in);
		int num=1, count=0, sum=0;
		
		while(num!=0) {
			System.out.println("Enter number or press '0' to quit/exit");
			num = scan.nextInt();
			if(num==0) {
				break;
			}
			sum = sum+num;
			count++;
		}//end of loop
		double avg = ((double)sum/(double)count);
		System.out.println("Average: "+avg);//required output
		scan.close();

	}

}
