package collection_Methods_Concepts;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class List_Interface_behaviour 
{

	
	public static void main(String[] args) 
	{
		List L1=new ArrayList();
		
	//	L1.add("Anvi");
		L1.add(23);  //check indexing, check duplicates, check null, order of insertion.
		L1.add(23);
		L1.add(45);
		L1.add(89);
		L1.add(698);
		L1.add(null);
		L1.add(null);
		L1.add(null);
		
		
		
		System.out.println(L1);
		
		
	}
}
