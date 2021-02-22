package practicePrblmPattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines ");
		int row=sc.nextInt();
		int i;
		int j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=row-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
