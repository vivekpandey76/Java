package patternSum;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int number=1;
		 int i;
		 int j;
		 for(i=1;i<=n;i++) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print("  ");
			 }
			 for(j=1;j<=i;j++) {
				 System.out.print(number+"  ");
				 number++;
			 }
			 System.out.println();
		 }

	}

}
