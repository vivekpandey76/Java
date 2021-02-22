package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int reversedNumber=0;
		while(temp!=0) {
			int lastDigit=temp%10;
		    reversedNumber=reversedNumber*10+lastDigit;
		    temp/=10;
		}
		if(reversedNumber==n) {
			System.out.println(n+ " Is palindrome");
		}
		else
		{
			System.out.println(n+ " IS not a palindrome");
		}
		

	}

}
