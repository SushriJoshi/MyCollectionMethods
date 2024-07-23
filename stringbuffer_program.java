package stringbuffer_stringbuilder;

public class stringbuffer_program 
{
public static void main(String[] args) 
{
	

	StringBuffer s1=new StringBuffer("Sushri");

	System.out.println("Printing string buffer value-->"+s1);
	
	StringBuffer s2=s1.append(" Joshi");
	System.out.println("Printing append value-->"+s2);
	
	StringBuffer s3=s2.insert(6, " Abinash");
	System.out.println("Printing the value of string buffer after inserting abinash="+s3);

	StringBuffer s4=s3.replace(7, 14, "Anvika Negi");
	System.out.println("replacing abinash with Anvika-->"+s4);
	
	System.out.println("Deleting Joshi and printing"+s4.delete(19, 24));
	
	
}
}

