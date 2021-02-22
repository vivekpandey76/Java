import java.util.Scanner;

public class UserInputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the rate :");
//        float rate=sc.nextFloat();
//        System.out.println("Enter The principal :");
//        int principal=sc.nextInt();
//        System.out.println("Enter the time :");
//        int time=sc.nextInt();
//        float rateOfInterest=(principal*rate*time)/100;
//        System.out.println(rateOfInterest);
         
        //Checking the age of the person and giving the output
		
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		if(age>18 || age<30) {
			System.out.println("You are adult you can now fuck anyone");
		}else if(age>45) {
			System.out.println("You are To old go watch pogo ");
		}else if(age<18) {
		    System.out.println("You are kid go watch cartoon network");
		}
		
        
	}

}
