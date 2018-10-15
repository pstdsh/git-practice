package practice;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class RemoveLeadingZero 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your String here: ");
		String str=in.nextLine();
		
		in.close();
		
	   int k=Integer.parseInt(str);
	   System.out.println("Print the integer value: " +k);
	   String str1=Integer.toString(k);
	   System.out.println("The result after removal of zeroes: " +str1);
	}

}
