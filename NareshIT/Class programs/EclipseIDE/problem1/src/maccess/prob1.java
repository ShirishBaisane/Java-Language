package maccess;
import java.util.Scanner;
public class prob1 {
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String(in Capital letters):");
	String str = s.nextLine();
	int len = str.length();
	int sum=0;
	for(int i=0; i<=len-1; i++) {
		char ch = str.charAt(i);
		switch(ch) {
		
		case 'M':
			sum+=144;
			break;
		
		case 'A':
			sum+=0;
			break;
		
		case 'N':
			sum+=233;
			break;
			
		case 'O':
			sum+=377;
			break;
			
		case 'R':
			sum+=1597;
			break;
			
		case 'E':
			sum+=3;
			break;
			
		}//end of switch
	}//end of for-loop
	System.out.println("Sum of letters: "+sum);
	s.close();
	}
}
