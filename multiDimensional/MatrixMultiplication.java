package multiDimensional;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimesions of MAtrix ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int i;
		int j;
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		int c[][]=new int[rows][cols];
	    for(i=0;i<rows;i++) {
	    	for(j=0;j<cols;j++) {
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    for(i=0;i<rows;i++) {
	    	for(j=0;j<cols;j++) {
	    		b[i][j]=sc.nextInt();
	    	}
	    }
	    for(i=0;i<cols;i++) {
	    	for(j=0;j<rows;j++) {
	    		c[i][j]=a[i]
	    	}
	    }
	}

}
