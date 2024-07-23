package assert_cntinue_typcasting_Encapsulation;

class Amazon
{
	static void add()
	{
		System.out.println("Amazon");
	}

}

public class Classtypecasting_Upcasting extends Amazon
{

	public static void main(String[] args) 
	{
		Amazon A1=new Classtypecasting_Upcasting();  //implicitly
		// Amazon A1=(Amazon) new ClassTypecasting_Upcasting();   --->Explicitly
		
		A1.add();
		System.out.println(A1);

	}

}
