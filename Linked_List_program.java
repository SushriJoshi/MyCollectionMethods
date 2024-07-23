package collection_Methods_Concepts;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_program {

	public static void main(String[] args) 
	{
		LinkedList L1=new LinkedList();
		L1.add(44);
		L1.add(98);
		L1.add(852);
		L1.add("Manisha");
		L1.add("Sushri");
		L1.add("Ria");
		System.out.println(L1);
		System.out.println(L1.getFirst());
		System.out.println(L1.getLast());
		
		System.out.println(L1.peekFirst());
		System.out.println(L1.peekLast());
		
		System.out.println("______________________");
		System.out.println(L1.get(2));
		System.out.println(L1.set(1, "Anvika"));
		System.out.println(L1.indexOf("Sushri"));
		System.out.println(L1);
		
		L1.addFirst("Vidya");
		System.out.println(L1);
		L1.addLast(45);
		System.out.println(L1);
		
		L1.removeFirst();
		System.out.println(L1);
		
		L1.removeLast();
		System.out.println(L1);
		
		Iterator I1=L1.iterator();
		while(I1.hasNext())
				{
			System.out.println(I1.next());
				}

		ListIterator I2=L1.listIterator();
		System.out.println("Next method");
		while(I2.hasNext())
		{
			System.out.println(I2.next());
		}
	System.out.println("Previous method.");	
		while(I2.hasPrevious())
		{
			System.out.println(I2.previous());
		}
		
	}

}
