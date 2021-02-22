package Loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		boolean isPrime=true;
		//For(int i=2;i<=number;i++) 1st method
		for(int i=2;i*i<=number;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(number<2) {
			isPrime=false;
		}
		if(isPrime==false) {
			System.out.println("THe number is non prime");
		}else {
			System.out.println("The number is prime");
		}
			
	}

}
