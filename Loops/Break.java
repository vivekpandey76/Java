package Loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       for(;;) {
    	   int n=sc.nextInt();
    	   if(n<0) {
    		   break;
    	   }
    	   System.out.println("THe value is positive integer keep going");
       }
	}

}
