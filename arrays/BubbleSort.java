package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {12,2,3,5,2,1,23,4,-2};
		int i;
		int j;
		int n=a.length;
		for(i=0;i<n-1;i++) {
			boolean sorted=true; //If we didnt swap one time if we iterate through array that means
			//Are array is already get swap 
			for(j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted =false;
				}
			}
		if(sorted) break;//Since we didnt did any swap that why array is in sorted from and break the looop
		}
		for(int item:a){
			System.out.print(item+" ");
		}

	}

}
