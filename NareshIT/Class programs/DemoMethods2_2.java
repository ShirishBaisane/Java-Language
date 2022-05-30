import java.util.Scanner;//import Scanner from 'util' library

class  DemoMethods2_2
{
	public static void main(String[] args)//memory in Class 
	{
		Scanner s = new Scanner(System.in);//input assignment for console(keyboard), method_object 's' created & memory in HeapArea.
		//read data from keyboard
		System.out.println("===Enter User Details:===");
		System.out.println("");
		System.out.println("Enter your UserName:");
		String uName = s.nextLine();//memory in Class
		System.out.println("Enter your mailId:");
		String mID = s.nextLine();//memory in Class
		System.out.println("Enetr Your Mobile number:");
		long pNo = s.nextLong();//memory in Class

		//display the details
		System.out.println("");
		System.out.println("===Your Details:===");
		System.out.println("Username: "+uName);//accessed from main_method,i.e. Class
		System.out.println("mailId: "+mID);//accessed from main_method,i.e. Class
		System.out.println("MobileNo: "+pNo);//accessed from main_method,i.e. Class
	}
}
