package i10;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Welcome to CGPA calculator===");
		double[] spi = new double[8];
		for(int i=0; i<8; i++) {
			System.out.println("Enter Sem"+(i+1)+" SPI: ");
			spi[i] =  scan.nextDouble();
		}
		double total=0;
		for(int i=0; i<8; i++) {
			total = total+spi[i];
		}
		double cgpa = total/8;
		System.out.println("CGPA is: "+cgpa);
		
		scan.close();
	}

}
