package collection_Methods_Concepts;

class Upcasting_One
{
	static void Vehicle()
	{
		System.out.println("Runi");
	}
	
	static void Busses()
	{
		System.out.println("Joshi");
	}
}


public class Upcasting_two_classes extends Upcasting_One
{

	void add()
	{
		System.out.println("Sushri");
	}
	
	public static void main(String[] args) 
	{
		Upcasting_One U1=new Upcasting_two_classes();
		
		U1.Vehicle();
		U1.Busses();
//		U1.add();   //We can not utilize child class properties.
		
	}
}
