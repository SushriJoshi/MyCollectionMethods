package collection_Methods_Concepts;


// import java.util.Collections;
import java.util.Vector;

public class Vector_Behaviour_Program {

	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		v1.add("11");
		v1.add("12");
		v1.add("11");
		v1.add("16");
		v1.add(null);
		v1.add("19");
		
	
	//Collections.sort(v1);
	System.out.println(v1);
	v1.addElement("Sushri");
	
	System.out.println(v1);
	
	System.out.println(v1.firstElement());
	
	System.out.println(v1.lastElement());
	
	System.out.println(v1.removeElement("16"));
	
	v1.removeElementAt(1);
	System.out.println(v1);
	
	System.out.println(v1.capacity());
	
	v1.removeAllElements();
	System.out.println(v1);
		
	}

}
