import java.util.Scanner;//import Scanner from 'util' library

class AsgnMathods1
{

	public static void main(String[] args) //memory in Class
	{
		Scanner s = new Scanner(System.in);//input assignment for console(keyboard), method_object 's' created & memory in HeapArea.
		//read data from keyboard
		System.out.println("==Enter Product_details:==");
		System.out.println("Product Name:");
		String pName = s.nextLine();//memory in Class
		System.out.println("Product Code:");
		String pCode = s.nextLine();//memory in Class
		System.out.println("Product Price:");
		float pPrice = s.nextFloat();//memory in Class
		System.out.println("Product Quantity:");
		int pQty = s.nextInt();//memory in Class
		System.out.println("");
		//display the details
		System.out.println("==The Product Details Are:==");
		System.out.println("Product Name"+pName);//accessed from main_method,i.e. Class
		System.out.println("Product Code:"+pCode);//accessed from main_method,i.e. Class
		System.out.println("Product Price:"+pPrice);//accessed from main_method,i.e. Class
		System.out.println("Product Quantity:"+pQty);//accessed from main_method,i.e. Class
	}
}
