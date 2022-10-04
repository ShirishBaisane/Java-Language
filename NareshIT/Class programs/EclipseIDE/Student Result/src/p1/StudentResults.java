package p1;

public class StudentResults {
	String result;//instance variables
	public String calculate(float per, boolean p) {
		if(p) {
			result = "Fail";
		}
		else if(per>=70 && per<=100) {
			result = "Distinction";
		}
		else if(per>=60 && per<70) {
			result = "First Class";
		}
		else if(per>=50 && per<60) {
			result = "Second Class";
		}
		else if(per>=40 && per<50) {
			result = "Third Class";
		}
		else {
			result = "Fail";
		}//end of Ladder if-else
		return result;
	}
}
