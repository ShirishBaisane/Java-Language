package DemoReferences3;

public class Display {
	public Student stu;//reference_variable
	
	public Display(Student st) {
		stu = st;
	}
	
	public void dis() {
		stu.getStudent();
	}

}
