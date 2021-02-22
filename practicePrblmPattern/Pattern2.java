package practicePrblmPattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines ");
        int row=sc.nextInt();
        int i;
        int j;
        //Print 1st row as it is using loops from 1 to no.of rows time
        for(i=1;i<=row;i++) {
        	System.out.print("* ");
        }
        System.out.println();
      //Outer loop will run from 1 to row-1 because 1st rows we have already print above
        for(i=1;i<=row-1;i++) {
        int spaces=2*i;  //Spaces in the problem is multiple of 2 2nd row have 2 spaces 3rd 6th..
      
        for(j=1;j<=spaces;j++) {
           	System.out.print("  ");  //Blank spaces before star
        }
        //This loop will run till row-1 because 1st row is already print and star is decrement one by one in each row
        for(j=i;j<=row-1;j++) {
        	System.out.print("* ");
        }
        System.out.println();
        
        }
       
	}

}
