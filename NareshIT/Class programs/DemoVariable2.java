class DemoVariables2
{
 public static void main(String[]args)
	{
	 String name = "Shirish";
	 String rollNo = "A005";
	 String branch = "Chemical+Finance";
	 int s1=82, s2=59, s3=79,s4=93,s5=86,s6=74;
	 int total = s1+s2+s3+s4+s5+s6;
	 //float percent = (total/6)F;
	 float percent = (float)total/6; //Type casting
	 System.out.println("STUDENT INFORMATION:");
	 System.out.println("Name:"+name);
	 System.out.println("Roll No.:"+rollNo);
	 System.out.println("Branch:"+branch);
	 System.out.println("SUBJECT REPORT:");
	 System.out.println("Sub1:"+s1);
	 System.out.println("Sub2:"+s2);
	 System.out.println("Sub3:"+s3);
	 System.out.println("Sub4:"+s4);
	 System.out.println("Sub5:"+s5);
	 System.out.println("Sub6:"+s6);
	 System.out.println("Total marks(put of 600):"+total);
	 System.out.println("Percentage(%):"+percent);
	}

}