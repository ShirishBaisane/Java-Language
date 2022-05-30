import java.util.Scanner;

class AsgnMathods1
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("==Enter Product_details:==");
		System.out.println("Product Name:");
		String pName = s.NextLine();
		System.out.println("Product Code:");
		String pCode = s.NextLine();
		System.out.println("Product Price:");
		float pPrice = s.NextFloat();
		System.out.println("Product Quantity:");
		int pQty = s.NextInt();
		System.out.println("");
		System.out.println("==The Product Details Are:==");
		System.out.println("Product Name"+pName);
		System.out.println("Product Code:"+pCode);
		System.out.println("Product Price:"+pPrice);
		System.out.println("Product Quantity:"+pQty);
	}
}
