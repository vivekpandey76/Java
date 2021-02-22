package methodOops;

//Note:Java is always pass by value it means when the paramter his passed its duplicate value is 
//passed to that function so whatever changes are made in that value it doesnot effect original value
public class IntroductionNotes {

	public static void main(String[] args) {
		int firstNumber=34;
		int secondNumber=44;
		int result=maximum(firstNumber,secondNumber);
		System.out.println(result);
    
		helloMessage();
	}
	
	//Method syntax: public static returntype mathodname(parameters);
	//By using method we dont have to write same block of code again and again 
	//If returntype is void then there should not be any value returning;
	static int maximum(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	//In method each methodname and parameter should not have same signature like datatype
	//eg:static void maxOf(int a,int b) 2)static void maxOf(int c,int d) this will produce error because data type and name of method issame
	//ifeg:static void maxOf(int a,int b) 2)static void maxOf(int x,float d)This will not produce error
	static void helloMessage() {
		System.out.println("This is method with void returntype");
	}
    
	//What is method overloading?
	//When the class have same method name but different parameter is called method overloading
}
