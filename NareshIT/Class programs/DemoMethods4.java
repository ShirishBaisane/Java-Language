//WAP tp read bSal and calculate totSal(note:bSal must be min 12000)

import java.util.Scanner;
class EmployeeSalary{
	float calculate(float b){
		float totSal = b+(b*0.93f)+(b*0.63f);
		return totSal;
	}
}

public class DemoMethods4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		float bSal;
		abc:
		while(true){
			float x = s.nextFloat();
			if(x>12000){
				bSal=x;
				break abc;
			}
			else{
				System.out.println("Enter valid Amount...");
			}
		}
		EmployeeSalary ob = new EmployeeSalary();
		float totSal = ob.calculate(bSal);
		System.out.println("Total Salary: "+totSal);
		
		s.close();
	}
}