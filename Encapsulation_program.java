package assert_cntinue_typcasting_Encapsulation;

class Google_Auth
{
	private int age=18;
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
}

public class Encapsulation_program 
{

	public static void main(String[] args) 
	{
	
		Google_Auth g1=new Google_Auth();
		g1.setAge(55);
		g1.getAge();
		System.out.println(g1.getAge());
		
	}

}
