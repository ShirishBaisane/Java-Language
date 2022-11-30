package test;

public class GenerateBranch {
	
	public String branch = null;
	
	public String generate(String code) {
		switch(code)
		{
			case "05": 
				branch = "CSE";
				break;
			case "04": 
				branch = "ECE";
				break;
			case "02": 
				branch = "EEE";
				break;
		}
		return branch;
	}
}
