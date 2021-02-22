package practicePrblmPattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
        int i;
        int j;
        //1st loop is for 0 to rows-1 because columns condition to satisfied 
        for(i=0;i<=rows-1;i++) {
        	//1st steps is to check number of blank spaces coming before numbers
        	for(j=1;j<=rows-i-1;j++) {
        		System.out.print("  ");
        	}
        	int columns=2*i+1;
        	for(j=1;j<=columns;j++) {
        		System.out.print(j);
        		System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}
