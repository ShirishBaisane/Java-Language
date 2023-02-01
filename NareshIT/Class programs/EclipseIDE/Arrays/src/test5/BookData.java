package test5;

public class BookData {
	public String bCode, bName, bAuthor;
	public float bPrice;
	public int bQty;
	
	public BookData(String bCode, String bName, String bAuthor, float bPrice, int bQty) {
		this.bCode = bCode;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.bQty = bQty;
	}
	//we are loading Local variable data to Instance variable.
	//we use 'this' keyword because same name in Local variable and Instance variables.
	
	public String toString() {
		return bCode+"\t"+bName+"\t"+bAuthor+"\t"+bPrice+"\t"+bQty;
	}

}
