package patternSum;

import java.util.Scanner;

public class Pattern4 {
        public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of lines ");
       int n=sc.nextInt();
       int i;
       int j;
       for(i=1;i<=n;i++) {
    	   for(j=1;j<=n-i;j++) {
    		   System.out.print("  ");  //Starting spaces coning before star 2(n-i)
    	   }
    	   for(j=1;j<=i;j++) {
    		   System.out.print("*   ");   //Two spaces because in between one star there are two spaces
    	   }
    	   System.out.println();
       }
        

}
}