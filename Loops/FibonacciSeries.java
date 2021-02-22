package Loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f0=0;
		int f1=1;
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which you have to calculate fibonacci series:");
		int n=sc.nextInt();
		System.out.print(f0+" ");
		System.out.print(f1+" ");
		for(i=0;i<n-2;i++) {
			int f2=f0+f1;
			f0=f1;
			f1=f2;
			System.out.print(f2+" ");
		}

	}

}
