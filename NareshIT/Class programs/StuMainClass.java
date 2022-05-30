//Problem Styatement:
//
//

import java.util.Scanner;

class Result{
	String result;
	String result(float per,boolean i){
		if(i){
			result="Fail";
		}
		else if(per>=70 && per<100){
			result="Distinction";
		}
		else if(per>=60 && per<70){
			result="First Class";
		}
		else if(per>=50 && per<60){
			result="Second Class";
		}
		else if(per>=35 && per<50){
			result="Third Class";
		}
		else {
			result="Fail";
		}
		return result;
	}
	
}

class Percentage{
	float percent(int tm){
		float pert = (float)tm/6;
		return pert;
	}
}

public class StuMainClass{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		boolean k=true;
		System.out.println("***Enter Student's details***");
		
		//read and store the data
		System.out.println("Enter stuName:");
		String sname = s.nextLine();
		System.out.println("Enter rollNo:");
		int rNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter Branch:");
		String branch = s.nextLine();
		System.out.println("*Enter 6 Subject marks*");
		System.out.println("Sub1:");
		int s1 = Integer.parseInt(s.nextLine());
		System.out.println("Sub2:");
		int s2 = Integer.parseInt(s.nextLine());
		System.out.println("Sub3:");
		int s3 = Integer.parseInt(s.nextLine());
		System.out.println("Sub4:");
		int s4 = Integer.parseInt(s.nextLine());
		System.out.println("Sub5:");
		int s5 = Integer.parseInt(s.nextLine());
		System.out.println("Sub6:");
		int s6 = Integer.parseInt(s.nextLine());
		
		if((s1>0 && s1<=100)&&(s2>0 && s2<=100)&&(s3>0 && s3<=100)&&(s4>0 && s4<=100)&&(s5>0 && s5<=100)&&(s6>0 && s6<=100)){
			k=false;
			int totMarks = s1+s2+s3+s4+s5+s6;
			
			Percentage ob1 = new Percentage();
			float per = ob1.percent(totMarks);
			
			Result ob2 = new Result();
			String result = ob2.result(per,k);
			
			System.out.println("===Student's Report Card===");
			System.out.println("Name:"+sname);
			System.out.println("Roll number:"+rNo);
			System.out.println("Branch: "+branch);
			System.out.println("Subjects Marks:");
			System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+s4+"\t"+s5+"\t"+s6);
			System.out.println("Total Marks: "+totMarks);
			System.out.println("Percentage: "+per);
			System.out.println("Result:"+result);
		}
		else{
			System.out.println("Invalid marks:");
		}
		
		s.close();
	}
}
