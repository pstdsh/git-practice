package practice;

public class PrintZeroes {

	public static void main(String[] args) 
	{
		int i;
		String str="000013AC0090";
		char[] c=str.toCharArray();
		
		//char[] b=new char[str.length()];
		
		for(i=0;i<c.length;i++)
		{
			if(!((c[i])=='0'))
				System.out.print(c[i]);	
			break;
		}
		System.out.print (c[i]);
	}

}
