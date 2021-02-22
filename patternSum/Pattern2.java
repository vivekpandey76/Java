package patternSum;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of line ");
           int number=sc.nextInt();
           //We put number of line in i and run it till the number is grater or equal to one
           for(int i=number;i>=1;i--) {
        	   for(int j=1;j<=i;j++) {
        		   System.out.print("* ");
        	   }
        	   System.out.println();
           }
	}

}
