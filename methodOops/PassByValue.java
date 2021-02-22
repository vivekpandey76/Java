package methodOops;

public class PassByValue {

	public static void main(String[] args) {
		int c=23;
		int d=43;
		swap(c,d);
		//Here the original value remain the same because whatever swapping are done is done in duplicate value
		System.out.println(c+" "+d);
		

	}
    static void swap(int a,int b) {
    	int temp=a;
    	a=b;
    	b=temp;
    }
}
