package whileLoops;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int lastDigit=temp%10;
			temp/=10;
			sum+=lastDigit;
		}
		System.out.println("The sum of the digit is "+sum);

	}

}
