
import java.util.Scanner;

public class DemoString2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String str = s.nextLine();
		 int len = str.length();
		 System.out.println("===Choice===");
		 System.out.println("1.Normal\n2.Reverse of String");
		 System.out.println("Enter the Choice");
		 int choice = s.nextInt();
		 switch(choice) {
		 	case 1:
		 		for(int i=0; i<=len-1; i++) {
		 			char ch1 = str.charAt(i);//charAt() method
		 			System.out.print(ch1);
		 		}//end of loop
		 		break;
		 	case 2:
		 		for(int i=len-1; i>=0; i--) {
		 			char ch1 = str.charAt(i);//charAt() method
		 			System.out.print(ch1);
		 		}//end of loop
		 		break;
		 	default: 
		 		System.out.println("Invalid choices...");
		 }//end of switch
		 s.close();
	}

}
