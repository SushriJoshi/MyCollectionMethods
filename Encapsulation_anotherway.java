package assert_cntinue_typcasting_Encapsulation;


public class Encapsulation_anotherway 
{

	private String username="Sushri";
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	private String mobnumber="2345678";
	
	public String getmobnumber()
	{
		return mobnumber;
	}
	
	public void setmobnumber(String mobnumber)
	{
		this.mobnumber=mobnumber;
	}
	public static void main(String[] args) 
	{
		Encapsulation_anotherway v1=new Encapsulation_anotherway();
		System.out.println(v1.username);
		System.out.println(v1.mobnumber);
	}

}
