package practice;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String original;
		String rev="";
		
		System.out.println("Enter the string to reverse : ");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		sc.close();
		
		int len=original.length();
				
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
        System.out.println("The Original String is :" +original);
        System.out.println("The Reverse String is :" +rev);
	}


}
