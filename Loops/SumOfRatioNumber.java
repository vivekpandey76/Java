package Loops;

import java.util.Scanner;

public class SumOfRatioNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		float i;
		float result=1;
		for(i=1;i<=n;i++) {
			result+=1/i;
		}
		System.out.println("The sums of the series is :"+result);

	}

}
