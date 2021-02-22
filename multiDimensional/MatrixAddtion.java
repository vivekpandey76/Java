package multiDimensional;

import java.util.Scanner;

public class MatrixAddtion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension of matrix");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		System.out.println("Enter the value of matrix A");
		int i;
		int j;
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of matrix B");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		int c[][]=new int[rows][cols];
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The addition of Matrix A and B are ");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
