package assert_cntinue_typcasting_Encapsulation;

public class This_Keyword 
{
	int age;
	String name;
	double salary;
	
	void StudentDetails(int age, String name, double Salary)
	{
		this.age=age;
		this.name=name;
		this.salary=Salary;
		
	}

	public static void main(String[] args) 
	{
		This_Keyword t1=new This_Keyword();
		t1.StudentDetails(45, "Rohit", 87000);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}
