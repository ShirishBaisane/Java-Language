package maccess;
import java.util.Scanner;

class add{
	int funt(int a, int b, int c) {
		int n1 = a/1000;
		int n2= (b/100)%10;
		int gr = 0;
		do {
			int p = c%10;
			if(p>gr){
				gr=p;
			}
			c=c/10;
		}while(c!=0);
		int key = (n1*n2)-gr;
		return key;
	}
}

public class prob2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int in1,in2,in3;
		System.out.println("Enter the 3 numbers");
		while(true) {
			System.out.println("Enter the input1:");
			int i1 =s.nextInt();
			if(1000<= i1){
				if(i1 <=9999) {
					in1=i1;
					break;
				}
			}
			else {
				System.out.println("Retype the number in Range!!");
			}
		}
		
		while(true) {
			System.out.println("Enter the input2:");
			int i2 =s.nextInt();
			if(1000<= i2){
				if(i2 <=9999) {
					in2=i2;
					break;
				}
			}
			else {
				System.out.println("Retype the number in Range!!");
			}
		}
		
		while(true) {
			System.out.println("Enter the input3:");
			int i3 =s.nextInt();
			if(1000<= i3){
				if(i3 <=9999) {
					in3=i3;
					break;
				}
			}
			else {
				System.out.println("Retype the number in Range!!");
			}
		}
		add ob = new add();
		int k = ob.funt(in1,in2,in3);
		System.out.println("=============================");
		System.out.println(k);
		s.close();

		}
		
		
	}


