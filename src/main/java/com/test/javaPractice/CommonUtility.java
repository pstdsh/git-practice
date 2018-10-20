package com.test.javaPractice;

public class CommonUtility {

	/*Using user-defined function : Define a function to compare values with following conditions :
		if (string1 > string2) it returns a positive value.
		if both the strings are equal lexicographically
		i.e.(string1 == string2) it returns 0.
		if (string1 < string2) it returns a negative value.*/

    // This method compares two strings 
    // lexicographically without using 
    // library functions 
    public int stringCompare(String str1, String str2) 
    { 
  
        int l1 = str1.length(); 
        int l2 = str2.length(); 
  
        for (int i = 0; i < l1 && i < l2; i++) { 
            int str1_ch = (int)str1.charAt(i); 
            int str2_ch = (int)str2.charAt(i); 
  
            if (str1_ch == str2_ch) {
            	System.out.println("Positive result");
                continue; 
            } 
            else { 
            	System.out.println(str1_ch - str2_ch);
                return str1_ch - str2_ch; 
            } 
        } 
  
        // Edge case for strings like 
        // String 1="Geeks" and String 2="Geeksforgeeks" 
        if (l1 < l2) { 
        	System.out.println("if (string1 < string2) it returns a negative value: " +(l1 - l2));
            return l1 - l2; 
        } 
        else if (l1 > l2) {
        	System.out.println("if (string1 < string2) it returns a positive value: " +(l1 - l2));
            return l1 - l2; 
        } 
  
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
        	System.out.println("Print the matching string result as : " +0);
            return 0; 
        } 
    }

	// Java program to illustrate creating an array 
	// of integers,  puts some values in the array, 
	// and prints each value to standard output. 

	public void arrayDeclaration()
	{  
		// declares an Array of integers. 
		int[] arr;   
		// allocating memory for 5 integers. 
		arr = new int[5];           
		// initialize the first elements of the array 
		arr[0] = 10; 	          
		// initialize the second elements of the array 
		arr[1] = 20; 	          
		//3rd element
		arr[2] = 30; 
		arr[3] = 40; 
		arr[4] = 50; 
		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at index " + i +  
					" : "+ arr[i]); 
	}
	//second method to get set of objects
	public void getArrayObj()
	{
		// Java program to illustrate creating an array of 
		// objects 
		// declares an Array of integers. 
		Student[] arr; 
		// allocating memory for 5 objects of type Student. 
		arr = new Student[5]; 
		// initialize the first elements of the array 
		arr[0] = new Student(1,"aman"); 
		// initialize the second elements of the array 
		arr[1] = new Student(2,"vaibhav"); 
		// so on... 
		arr[2] = new Student(3,"shikar"); 
		arr[3] = new Student(4,"dharmesh"); 
		arr[4] = new Student(5,"mohit"); 
		//arr[5] = new Student(6,"lohit"); 
		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + 
					arr[i].roll_no +" "+ arr[i].name); 
		
		
	}
}
