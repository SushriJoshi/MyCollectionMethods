package collection_Methods_Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Program {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sushri");
		a1.add("Joshi");
		a1.add("Avi");
		a1.add("Anvi");
		
		System.out.println(a1);
		
		Iterator i1=a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

		
		ListIterator   L1=a1.listIterator();
		
		while(L1.hasNext())
		{
			System.out.println(L1.next());
		}
		
		while(L1.hasPrevious())
		{
			System.out.println(L1.previous());
		}
	}

}
