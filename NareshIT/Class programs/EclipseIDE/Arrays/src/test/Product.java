package test;

public class Product {
	public String pCode, pName;
	public float pPrice;
	public int pQty;
	
	public Product(String pCode, String pName, float pPrice, int pQty) {
		this.pCode= pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	//We are loading Local variable data to Instance variable
	//We use 'this' keyword because same names in Local variable and Instance variable
	
	public String toString() {
		return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
	}
}
