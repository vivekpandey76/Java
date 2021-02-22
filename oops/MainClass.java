package oops;

class People{
	//properties of people
	//Class does not take any memory so whatever changes we have making in object it does not effect any other object
	int age,height;
	String name,languages;
	
	//Method or behavour of people
	public void description() {
		System.out.println("My name is "+name+" and i am expert in the "+languages);
	}
	
	public void run() {
		System.out.println(name+" Is running like a lion");
	}
}

public class MainClass {

	public static void main(String[] args) {
		//Object creation we can make infinity object from one class
		People vivek=new People();
		People pravesh=new People();
		vivek.age=12;
		vivek.name="Vivek pandey";
		vivek.languages="Java";
		
		pravesh.name="Pravesh Pandey";
		pravesh.languages="Java";
		pravesh.age=12;
		
		pravesh.description();
		
		vivek.run();
		vivek.description();
				

	}

}
