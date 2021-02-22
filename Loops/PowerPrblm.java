package Loops;

import java.util.Scanner;

public class PowerPrblm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base Value :");
		int base=sc.nextInt();
		System.out.println("Enter the power value :");
		int pow=sc.nextInt();
		int result=1;
		//Here we have to multiple base to power time eg :2^3=2*2*2
		for(int i=0;i<pow;i++) {
			result*=base;
		}
		System.out.println("The x raised to y is :"+result);

	}

}
