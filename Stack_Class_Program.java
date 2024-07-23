package collection_Methods_Concepts;

import java.util.Stack;

public class Stack_Class_Program {

	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		s1.add("Anvika");
		s1.add("Anvika");
		s1.add("56");
		s1.add("anvi");
		s1.add("32");
		s1.add("null");
		s1.add("null");
		
		System.out.println(s1);
		
		s1.addElement("Negi");
		System.out.println(s1);
		// all the method of vector class are present. Except that it has its own methods.
		
		s1.pop();
		System.out.println(s1);

		s1.peek();
		System.out.println(s1);
		
		s1.push("pari");
		
		System.out.println(s1);
	}

}
