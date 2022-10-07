package Volume;

public class Sphere {
	double pi = 3.14;
	public double vSphere(double r) {
		double area = (pi*r*r*r)*(4/3);
		return area;
	}
}
