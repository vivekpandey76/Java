package Loops;

public class NestedForLoop {

	public static void main(String[] args) {
		int i; 
		int j;
		for(i=1;i<=20;i++) {
			System.out.println("THe table of "+i);
			for(j=1;j<=10;j++) {
				int c=i*j;
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
