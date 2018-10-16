package practice;

public class SplitStringPractice {

	public static void main(String[] args) {
		/*1) Append second string to first string and 
	   store in first string:
	   a = a + b*/

	/*2) call the method substring(int beginindex, int endindex)
	   by passing beginindex as 0 and endindex as,
	      a.length() - b.length():
	   b = substring(0,a.length()-b.length());*/

	/*3) call the method substring(int beginindex) by passing 
	   b.length() as argument to store the value of initial 
	   b string in a
	   a = substring(b.length())*/
		
        String str = "geekss@for@geekss"; 
        //lmit rule-1:
        
        String[] arrOfStr = str.split("@", 2); 
        System.out.println("Limit rule-1 result:");
  
        for (String a : arrOfStr)
        {	
            System.out.println(a);
        }
        System.out.println(); 
      System.out.println("Limit rule-2 result:");
      String[] arrOfStr1 = str.split("@", 0); 
      for (String a : arrOfStr1)
      {	
          System.out.println(a);
      }
      System.out.println(); 
      //Rule-3:
      
      
      System.out.println("Limit rule-3 result:");
      String[] arrOfStr2 = str.split("e", -2); 
      for (String a : arrOfStr2)
      {	
          System.out.println(a);
      }
      
	}

}
