package p1;

public class EmpSalary {
	public void calculateDisplay(int bSal) {
		System.out.println("===Employee Salary===");
		System.out.println("Basic Salary = "+bSal);
		float tSal = bSal+(bSal*0.93F)+(bSal*0.63F);
		System.out.println("Total Salary = "+tSal);
	}
}
