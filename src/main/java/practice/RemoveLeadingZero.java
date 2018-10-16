package practice;

//import java.util.Scanner;

//import com.sun.xml.internal.ws.util.StringUtils;



public class RemoveLeadingZero 
{
	public static void main(String[] args)
	{
		/*	Scanner in=new Scanner(System.in);
		System.out.println("Please enter your String here: ");
		String str=in.nextLine();

		in.close();

	   int k=Integer.parseInt(str);
	   System.out.println("Print the integer value: " +k);
	   String str1=Integer.toString(k);
	   System.out.println("The result after removal of zeroes: " +str1);*/

		//sol-2
		//String str="000013AC0090";
		//String str1=StringUtils.stripStart(str, "0");
		int i, k=0;
		String str="000013AC0090";
		char[] c=str.toCharArray();
		
		char[] b=new char[str.length()];
		
		for(i=0;i<c.length;i++)
		{
			if(!((c[i])=='0'))

				break;
		}

		for(int j=i;j<c.length;j++)
		{
			b[k]=c[j];
			System.out.print(b[k]);
			k++;
		}
		System.out.println();
		
		str=String.valueOf(b);
		System.out.println(str);
	}

}

