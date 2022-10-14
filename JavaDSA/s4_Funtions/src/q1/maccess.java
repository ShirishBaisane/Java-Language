package q1;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find the Greatest and Smallest among three numbers===");
		System.out.println("Num1: ");
		int num1 = scan.nextInt();
		System.out.println("Num2: ");
		int num2 = scan.nextInt();
		System.out.println("Num3: ");
		int num3 = scan.nextInt();
		
		maccess m = new maccess();
		System.out.println("Greatest: "+m.grt(num1, num2, num3));
		System.out.println("Smallest: "+m.sml(num1, num2, num3));
		
		scan.close();
	}
	//method to find greatest number from 3.
	int grt(int n1, int n2,int n3) {
		int greatest=0;
		if(n1>n2) {
			if(n1>n3) {
				greatest = n1;
			}
		}
		if(n2>n1){
			if(n2>n3) {
				greatest = n2;
			}
		}
		if(n3>n1){
			if(n3>n2) {
				greatest = n3;
			}
		}
		return greatest;
	}
	//method to find smallest number from 3.
	int sml(int n1, int n2,int n3) {
		int smallest=0;
		if(n1<n2) {
			if(n1<n3) {
				smallest = n1;
			}
		}
		if(n2<n1){
			if(n2<n3) {
				smallest = n2;
			}
		}
		if(n3<n1){
			if(n3<n2) {
				smallest = n3;
			}
		}
		return smallest;
	}

}
