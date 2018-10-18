package com.test.javaPractice;

public class CommonUtility {

	

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
		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + 
					arr[i].roll_no +" "+ arr[i].name); 
	}
}
