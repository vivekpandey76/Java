package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//Hello world printing using loops 
		
//	    for(i=0;i<12;i++) {
//	    	System.out.println("Helo World "+i);
//	    }  
		
	//Simple User input  factorial calculator 
		
	/*int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value for which you have to calculate factorial :");
	int n=sc.nextInt();
	int i;
	for(i=n;i>0;i--) {
		fact*=i;
	}
    System.out.println("The factorial is :" +fact);*/
		
	//Simple addition of all number using for loops
		int i;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you have to find the sum of all number:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			result+=i;
		}
		System.out.println("The addition of all number are :"+result);
		}
}
