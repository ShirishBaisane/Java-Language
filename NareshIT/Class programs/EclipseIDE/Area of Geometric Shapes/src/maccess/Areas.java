package maccess;
import java.util.Scanner;
import functions.*;
public class Areas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("===Choose the Geometric shape to find the area===");
		System.out.println("1.Circle\n2.Reactangle\n3.Triangle");
		System.out.println("Enter the choice:");
		int choice = s.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter the Radius:");
				float r = s.nextFloat();
				ACircle ob1= new ACircle();
				double area1 = ob1.aCircle(r);
				System.out.println("Area of Circle: "+area1);
				break;
			case 2:
				System.out.println("Enter the Base:");
				float b = s.nextFloat();
				System.out.println("Enter the Height:");
				float h = s.nextFloat();
				ATri ob2= new ATri();
				double area2 = ob2.aTri(b,h);
				System.out.println("Area of Circle: "+area2);
				break;
			case 3:
				System.out.println("Enter the Width:");
				float w = s.nextFloat();
				System.out.println("Enter the Lenght:");
				float l = s.nextFloat();
				ARect ob3= new ARect();
				double area3 = ob3.aRect(w,l);
				System.out.println("Area of Circle: "+area3);
				break;
			default:
				System.out.println("Invalid Choice...!!!");
		}
		s.close();

	}

}
