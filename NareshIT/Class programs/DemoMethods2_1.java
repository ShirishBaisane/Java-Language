import java.util.Scanner;
class DemoMethods2_1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String uName = s.nextLine();//read String data
		System.out.println("Enter mailID:");
		String mID = s.nextLine();//read String data
		System.out.println("Enter Mobile number:");
		long pNo = s.nextLong();//read long data
	}
}