package DemoInterface4;

public class Greater implements IComparable {
	public int compareTo(int x, int y) {
		if(x>y) return x;
		else return y;
	}

}
