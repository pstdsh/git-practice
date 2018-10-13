package practice;

public class StringPractice 
{
	public static void main(String[] args) 
	{
		//1. length() method
		String sr="Ipsita Java Practice";
		int l=sr.length();
		System.out.println("length method used. " +l);
		
		//2.CharAt() method 
		String sr1="IpsitaIpsita";
		char ch=sr1.charAt(5);
		System.out.println("CharAt method used. "  +ch);
		
		//3. substring() method used
		String sr2="IpsitamakingPrograme";
		String sb=sr2.substring(4);
		System.out.println("substring method is used: " +sb);
		
		//4. substring() method used
		String sr3="IpsitamakingPrograme";
		String sb1=sr3.substring(3 , 8);
		System.out.println("substring method is used: " +sb1);
		
		//5. String concat(String str) ||concat(String str) method
		//Concatenates specified string to the end of this string
		String s1="Ipsita ";
		String s2=s1.concat("Loves her baby");
		System.out.println(s2);
		
		//6. int indexOf(String s) || indexOf(String s) method
		/*Returns the index within the string of the first 
		 * occurrence of the specified string */
		String s3= "IpsitaDashd";
		int in=s3.indexOf("I");
		System.out.println("the index of string result: " +in);
		 		
		//7. int indexOf(int n) || indexOf(String s) method
		String s4= "BadriPraSadrAth";
		int i=s4.indexOf("r");
		System.out.println("The result of 7 :" +i);
		
		//8. int indexOf (String s, int i)
		String s5= "BadriPraSadrAth";
		int i1=s5.indexOf("a" , 3);
		System.out.println("The result of 8 :" +i1);
		
		//9. int lastIndexOf(int n) || lastIndexOf(int n) method
		String s6= "BadriPraSadrAth";
		int i2=s6.lastIndexOf("r");
		System.out.println("The result of 9 :" +i2);
		
		//10. boolean equalsIgnorecase(String anotherString)
		String st="Ipsita";
		String st1="Ipsita";
		Boolean res=st.equalsIgnoreCase(st1);
		System.out.println("The result of method 10 :" +res);
		
		//11. String toLowerCase();
		String lowcase="ASDFGHJKIYdf";
		String reslow=lowcase.toLowerCase();
		System.out.println("The result of method 11 :" +reslow);
		
		//12. String toUpperCase();
		String uppcase="ASffdghfdwyef";
		String resupp=uppcase.toUpperCase();
		System.out.println("The result of method 11 :" +resupp);
		
		//13. String trim();
		//Returns the copy of the String, by removing white spaces at both ends. It does not affect white spaces in the middle
		String gettrm="   ..Ipsita Kumari Dash   ";
		String restrm=gettrm.trim();
		System.out.println("The result of method 11 :" +restrm);
		
		//14.String replace();
		String getrep="Ipsita Kumari Dash";
		String resrpl=getrep.replace('a', 's');
		System.out.println("The result of method 11 :" +resrpl);
		
	}
}
