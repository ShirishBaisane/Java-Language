import java.util.Scanner;//import Scanner from 'util' library
class AsgnMethods2 
{
	public static void main(String[] args) //memory in Class
	{
		Scanner s = new Scanner(System.in);//input assignment for console(keyboard), method_object 's' created & memory in HeapArea.
		//read data from keyboard
		System.out.println("==Enter Books_Details:==");
		System.out.println("Enter Book_Code:");
		String bCode = s.nextLine();//memory in Class
		System.out.println("Enter Book_Name:");
		String bName = s.nextLine();//memory in Class
		System.out.println("Enter Book_Author:");
		String bAuthor = s.nextLine();//memory in Class
		System.out.println("Enter Book_Price:");
		float bPrice = s.nextFloat();//memory in Class
		System.out.println("Enter Book_Quantity:");
		int bQty = s.nextInt();//memory in Class
		System.out.println("");
		//display the details
		System.out.println("==Book Details are:==");
		System.out.println("Book_Code:"+bCode);//accessed from main_method,i.e. Class
		System.out.println("Book_Name:"+bName);//accessed from main_method,i.e. Class
		System.out.println("Book_Author:"+bAuthor);//accessed from main_method,i.e. Class
		System.out.println("Book_Price:"+bPrice);//accessed from main_method,i.e. Class
		System.out.println("Book_Quantity:"+bQty);//accessed from main_method,i.e. Class
	}
}
