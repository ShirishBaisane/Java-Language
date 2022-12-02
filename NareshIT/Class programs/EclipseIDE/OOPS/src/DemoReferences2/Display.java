package DemoReferences2;

public class Display {
	public Product p;//References_variable
	
	public Display(Product prod) {
		p=prod;
	}
	
	public void dis() {
		p.getProduct();//method_call
	}

}
