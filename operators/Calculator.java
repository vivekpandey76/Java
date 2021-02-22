package operators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number :");
      int a=sc.nextInt();
      System.out.println("Enter the second number :");
      int b=sc.nextInt();
      System.out.println("Enter your choice:\n 1)Addition\n 2)Multiplication \n 3)Substraction \n 4)Division \n 5)Modulus ");
      int choice=sc.nextInt();
       int result=0;
       switch(choice) {
       case 1:
    	   result=a+b;
    	   break;
       case 2:
    	   result=a*b;
    	   break;
       case 3:
    	   result=a-b;
    	   break;
       case 4:
    	   result=a/b;
    	   break;
       case 5:
    	   result=a%b;
    	   break;
    	default:
    		System.out.println("Invalid choice");
       }
       System.out.println("The result of two number is "+result);
	}

}
