package collection_Methods_Concepts;

import java.util.ArrayList;


public class All_Methods_ArrayList_program 
{

	public static void main(String[] args) 
	{
		ArrayList A1=new ArrayList();
		
		A1.add("Manish");
		A1.add("Amrutha");
		A1.add("Zahir");
		A1.add(32);
		A1.add(12365);
		A1.add("false");
		A1.add(null);
		A1.add(null);
		A1.add(null);
		A1.add('C');
		A1.add("Manish");
		System.out.println(A1);
		
	
		
		System.out.println("Size of the Array list -->"+A1.size());
		System.out.println(A1.remove("Manish"));
		
		ArrayList A2=new ArrayList();
		
		A2.addAll(A1);
		A2.add("Sushri");
		A2.add("Anvi");
		System.out.println(A2);
		System.out.println("Size of the Array list -->"+A2.size());
		System.out.println(A2.remove(A1));
		
		
		boolean b1=A1.contains("Manish");
		System.out.println(b1);
		
		System.out.println(A2.contains("Zahir"));
		System.out.println(A2.containsAll(A1));
		
		System.out.println(A2.isEmpty());
		
		System.out.println(A2.removeAll(A1));
		
		ArrayList A3=new ArrayList();
		System.out.println(A3.isEmpty());
		
		
		
		
		
	}
}
