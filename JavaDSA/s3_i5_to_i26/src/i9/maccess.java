package i9;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] runs = new int[10]; 
		int balls;
		double overs;
		for(int i=0; i<10;i++) {
			System.out.println("Enter the runs scored by batsmen no."+(i+1)+" :");
			runs[i] = scan.nextInt();
		}
		int totalRuns =0;
		for(int i=0; i<10; i++) {
			totalRuns = totalRuns + runs[i];
		}
		System.out.println("Enter the number of Balls played: ");
		balls = scan.nextInt();
		overs = (double)balls/6;
		double avg = totalRuns/overs;
		System.out.println("Total Runs scored: "+totalRuns);
		System.out.println("Batting Average(strike rate): "+avg);
		
		scan.close();
	}

}
