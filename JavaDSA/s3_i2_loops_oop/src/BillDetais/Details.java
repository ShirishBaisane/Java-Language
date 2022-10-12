package BillDetais;

public class Details {
	double charge = 10.078125;
	 
	int bN, bU, cR, pR;
	//Constructor with parameter
	public Details(int bNumber, int bUnit, int cReading, int pReading)
	{
		bN = bNumber;
		bU = bUnit;
		cR = cReading; 
		pR = pReading;
	}
	
	//getter_method for Total bill amount
	public void getTBL() {
		System.out.println("Bill Number: "+bN);
		System.out.println("Billing Unit: "+bU);
		System.out.println("Tariff/Category: Residential");
		System.out.println("Current Reading: "+cR);
		System.out.println("Previous Reading: "+pR);
		System.out.println("Charge per unit(Rs.): "+charge);
		System.out.println("Total units: "+(cR-pR));
		System.out.println("Bill Amount(Rs.) (till dueDate): "+calculate(cR, pR, charge));//static_method_call
		System.out.println("");
	}
	
	//getter_method for Total bill amount
	public void getABL() {
		System.out.println("Bill Number: "+bN);
		System.out.println("Billing Unit: "+bU);
		System.out.println("Tariff/Category: Residential");
		System.out.println("Current Reading: "+cR);
		System.out.println("Previous Reading: "+pR);
		System.out.println("Charge per unit(Rs.): "+charge);
		System.out.println("Total units: "+(cR-pR));
		System.out.println("Bill Amount(Rs.) (till dueDate): "+calculate(cR, pR, charge));//static_method_call
		System.out.println("Bill Amount(Rs.) (after dueDate): "+(calculate(cR, pR, charge)+40));//static_method_call
	}
	
	static double calculate(int cR, int pR, double c) {
		int units = cR - pR;
		double tba = (Double)(units*c);
		return tba;
	}//end of method

}
