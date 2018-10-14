/*
 * String price="Rs 12345". Add integer value 10 Rs to price.
 *  Write a program ,where the result should show addition of these 2 values.
 */

package practice;

public class IntStringAddition {

	public static void main(String[] args) 
	{
		int a=10;
		String str="Rs 12345";
		
		//String str=String.valueOf(a)
		String str1=str.substring(3);
		System.out.println("The value of string str1 : " +str1);
		// to convert the String value str1 to Integer value
		int b=Integer.parseInt(str1);
		int c=a+b;
		System.out.println("The result of addition of 2 integer value is: "  +c);

	}

}
