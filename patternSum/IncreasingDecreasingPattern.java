package patternSum;

import java.util.Scanner;

public class IncreasingDecreasingPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n=sc.nextInt();
		int i;
		int j;
		int rows=2*n-1;
		for(i=1;i<=rows;i++) {
			if(i<=n) {
				for(j=1;j<=i;j++) {
					System.out.print("* ");
				}
				}else {
					for(j=1;j<=rows-i+1;j++) {
						System.out.print("* ");
					}
					
			}
			System.out.println();
		}
		

	}

}
