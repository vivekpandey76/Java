package practicePrblmPattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=2*n+1;
		int i; 
		int j;
		for(i=1;i<=rows;i++) {
			int spaces=2*i;
			if(i<=n) {
				for(j=i;j<=n;j++) {
					System.out.print("* ");
				}
				for(j=1;j<=spaces;j++) {
					System.out.print("  ");
				}
				for(j=1;j<=i-1;j++) {
					System.out.print("");
				}
				for(j=i;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else if(i==n+1) {
				System.out.println();
			}else {
				for(j=1;j<=i-n-1;j++) {
					System.out.print("* ");
//				   spaces-=4*j;
				}
//				for(j=1;j<=spaces;j++) {
//					System.out.print("  ");
//				}
//				for(j=1;j<=i-n-1;j++) {
//					System.out.print("* ");
//				}
				
				System.out.println();
				
			}
				
		}
		

	}

}
