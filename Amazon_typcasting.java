package assert_cntinue_typcasting_Encapsulation;

class google1
{
	static void add()
	{
		System.out.println("Amazon");
	}
}
public class Amazon_typcasting extends google1
{

	public static void main(String[] args) 
	{
		//google1 g1=new Amazon_typcasting();   //implicit upcasting
		google1 g1=(google1) new Amazon_typcasting();  //explicit upcasting
		add();
		System.out.println("Upcasting");
		
		//Downcasting
		Amazon_typcasting a1=(Amazon_typcasting)g1;
		System.out.println("Downcasting");
		
	}

}
