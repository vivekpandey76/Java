package arrays;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		//Step1 Take input number of student from the users
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student ");
		int numberOfStudent=sc.nextInt();
		//Declare the size of array as numberofstudent
		int marks[]=new int[numberOfStudent];
		//Take the marks from the user
		System.out.println("Enter the Marks of the student");
		int i;
		for(i=0;i<numberOfStudent;i++) {
			marks[i]=sc.nextInt();
		}
		int averageOfMarks=0;
		//Calculate sum of the marks and divide it with numberofStudent
		for(i=0;i<numberOfStudent;i++) {
			averageOfMarks+=marks[i];
		}
		averageOfMarks/=numberOfStudent;
		
		System.out.println("The average marks of the student is "+averageOfMarks);

	}

}
