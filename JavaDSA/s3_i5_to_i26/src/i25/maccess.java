package i25;

public class maccess {

	public static void main(String[] args) {
		int aug = 31;
		System.out.println("Kunal can go out only on even days of a month...");
		System.out.println("No. of days he can go out in August is: "+count(aug));
		
	}
	
	static int count(int days) {
		int count=0;
		for(int i=2; i<=days; i++) {
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}

}
