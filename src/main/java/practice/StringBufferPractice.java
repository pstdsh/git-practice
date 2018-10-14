package practice;

public class StringBufferPractice {

	public static void main(String[] args) {
		System.out.println("Hello");

		//1. length() method
		StringBuffer sb=new StringBuffer(" IpsitaDash");
		int len=sb.length();
		System.out.println("The result of lenght() method is :"  +len);

		//2. capacity () :the total allocated capacity can be found by the capacity( ) method.it is always 16+string length
		int cp=sb.capacity();
		System.out.println("The result of capacity() method is :"  +cp);

		//3. append() method
		sb.append("Kumari");
		System.out.println("The result of append method : " +sb);

		//4. insert(int index,char ch) method
		StringBuffer sb1=new StringBuffer(" IpsitaDash");
		sb1.insert(7, "K");
		System.out.println("The result for insert method :" +sb1);

		//5. insert(int index,String str) method
		StringBuffer sb2=new StringBuffer(" IpsitaDash");
		sb1.insert(7, "Kumari");
		System.out.println("The result for string insert method :" +sb2);

		//6. reverse()  
		StringBuffer sb3=new StringBuffer("IpsitaD");
		sb3.reverse();
		System.out.println("The result for reverse() method is: "  +sb3);

		// delete(int startIndex, int endIndex)
		StringBuffer sb4=new StringBuffer("IpsitaKDash");
		sb4.delete(4, 7);
		System.out.println("The result for delete(int startIndex, int endIndex) method is: "  +sb4);

		//deleteCharAt(int loc)
		StringBuffer sb5=new StringBuffer("IpsitaKDash");
		sb5.deleteCharAt(6);
		System.out.println("The result for deleteCharAt(int loc) method is: "  +sb5);

		//replace(int startIndex, int endIndex, String str)
		StringBuffer sb6=new StringBuffer("IpsitaKDash");
		sb6.replace(6,7, " ");
		System.out.println("The result for replace(int startIndex, int endIndex, String str) method is: "  +sb6);

	}

}
