package patternSum;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int number=sc.nextInt();
		int i;
		int j;
		for(i=1;i<=number;i++) {
			for(j=1;j<=number;j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}

	}

}
