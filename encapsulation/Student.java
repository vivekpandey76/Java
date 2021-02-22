package encapsulation;

//For encapsulation declare instance variable private and add getter and setter method
public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18) {
			System.out.println("Sorry ypu are to old");
		}else {
			this.age=age;
		}
	}

}
