package Loops;

import java.util.Scanner;

public class SumOfNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the positive number:");
      int n=sc.nextInt();
      float result=0;
      float i;
      for(i=1;i<=n;i++) {
    	  if(i%2==0) {
    		  result-=1/i;
    	  }else {
    		  result+=1/i;
    	  }
      }
      System.out.println("The result is :"+result);
	}

}
