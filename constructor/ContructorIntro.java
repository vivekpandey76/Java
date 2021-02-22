package constructor;
//Note:We cant create default constructor if we already has created a constructor but if we want to
//to create default constructor then Vehicle(){ }now default constructor is created
class Vehicle{
	int wheels;
	//This is no args constructor bcuz parameter is not there
	//WE have to pass that value as parameter which we know it will change according to object
	Vehicle(){
		wheels=4;
	}
}
//Constructor is similar to a method that is invoked when the object is intialized
public class ContructorIntro {
      ContructorIntro(){
    	  System.out.println("Constructor is created");
      }
	public static void main(String[] args) {
		//Whenever we created object constructor is auomatically called
//	   ContructorIntro obj=new ContructorIntro();
      Vehicle car=new Vehicle();
      System.out.println(car.wheels+" wheels ");
	}

}
