package practicePrblmPattern;
import java.util.Scanner;

public class IncreasingDecreasingPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n=sc.nextInt();
		int rows=2*n-1;
		int i;
		int j;
		//Outer loop will run 2*n-1 where n is input from user
		for(i=1;i<=rows;i++) {
			//Condition will checked whether i is less than n or not
			if(i<=n) {
				//Empty Spaces 
				for(j=i;j<=n-1;j++) {
					System.out.print("  ");
				}
				//After that star 
				for(j=1;j<=i;j++) {
				System.out.print("* ");
				}
			}else {
				//Empty spaces i-n assume i is 5th row n is user input that is 4 than spaces is 1 
				for(j=1;j<=i-n;j++) {
					System.out.print("  ");
				}
				for(j=1;j<=rows-i+1;j++) {
				System.out.print("* ");
				}
			}
			//Line breaks
			System.out.println();
		}

	}

}
