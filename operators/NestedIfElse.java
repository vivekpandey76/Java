package operators;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the 1st number:");
       int a=sc.nextInt();
       System.out.println("Enter the 2nd number:");
       int b=sc.nextInt();
       System.out.println("Enter the 3rd number:");
       int c=sc.nextInt();
       if(a>b && a>c) {
    	   System.out.println("1st value is maximum");
       }else if(b>a && b>c) {
    	   System.out.println("2nd value is Maximum");
       }else {
    	   System.out.println("3rd value is Maximum");
       }
	}

}
