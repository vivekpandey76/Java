package practicePrblmPattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines ");
		int row=sc.nextInt();
		int i;
		int j;
		//1st loop is outer loop number of time the loop will run total row 
		for(i=1;i<=row;i++) {
			//2nd loop will run from i to row-1 because spaces before * is one less than total number of rows
			for(j=i;j<=row-1;j++) {
				System.out.print("  ");
			}
			//3rd loop is for printing star with 3 spaces because 2 star gap have three spaces
			for(j=1;j<=i;j++) {
				System.out.print("*   ");
			}
			//Output For break the lines
			System.out.println();
		}
		
		
	}

}
