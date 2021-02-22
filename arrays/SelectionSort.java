package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		//In this sorting in 1st iteration we check which element is smallest and its index is swap with base index
		int a[]= {2,45,5,1,5,7,3};
		int i;
		int j;
		int n=a.length;
		for(i=0;i<n-1;i++) {
			int minIndex=i;
			for(j=i;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		for(int item:a) {
			System.out.print(item+" ");
		}
		

	}

}
