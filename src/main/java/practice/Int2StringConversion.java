package practice;

public class Int2StringConversion {

	public static void main(String[] args) 
	{
		/*
		 * Convert using Integer.toString(int)
		   Convert using String.valueOf(int)
		   Convert using new Integer(int).toString()
		   Convert using String.format()
		   Convert using DecimalFormat.
		   Convert using StringBuffer or StringBuilder.
		 */
		/* Sol-1:
		 * Integer in=new Integer(12345);
		 
		String str=in.toString();
		System.out.println("The result of int to String is: "  +in);
		*/
		//Sol-2
		int a=12345;
		String str1=String.valueOf(a);
		System.out.println("String value of a is: " +str1);
		
		

	}

}
