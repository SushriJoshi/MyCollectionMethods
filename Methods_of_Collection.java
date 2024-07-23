package collection_Methods_Concepts;

import java.util.ArrayList;

public class Methods_of_Collection {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add("radha");
		a1.add(32);
		a1.add(85);
		a1.add('m');
		a1.add("Sushri");
		a1.add(52364);	
		
		System.out.println(a1);
		
		
		ArrayList a2=new ArrayList();
		a2.add("Anvika");
		a2.addAll(a1);
		System.out.println(a2);
		
		
		ArrayList a3=new ArrayList();
		a3.add("Anusha");
		a3.add("myra");
		a3.add(123654);
		System.out.println(a3);
		a3.addAll(a2);
		System.out.println(a3);
	}

}
