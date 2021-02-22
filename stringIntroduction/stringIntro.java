package stringIntroduction;

public class stringIntro {

	public static void main(String[] args) {
		String name="Vivek Pandey   ";
		String anotherName=new String("Vivek Pandey");
		//The difference betweeen new and literal method initialization is the literal method store the name in string pool area and it 1st chekc whether that name is already
		//available in string pool area or not while anotherName store it in heap area and also in string poool area if not available the literal method is most preferable 
         System.out.println(name==anotherName);//It will provide false because one value is store in heap area and one in string pool area
	     System.out.println(name.equals(anotherName));//It will produce true because it check the value only whether it is same or not
	     
	     //1)indexOf
	     System.out.println(name.indexOf('P'));//It will provide the index of char in given string
	     
	     //2)charAt
	     System.out.println(name.charAt(4));//It will return char at index 4 that is k
	     
	     //3)concat
	     System.out.println(name.concat(" Rahul"));//It will provide result Vivek Pandey Rahul
	     
	     //4)substring
	     System.out.println(name.substring(3));
	    
	     //5)substring
	     System.out.println(name.substring(0,5));//It will return Vivek 
	     
	     //6)trim
	     System.out.println(name.trim());//It will trim the spaces from both the ends 
	     
	     //7)toLowerCase
	     System.out.println(name.toLowerCase());//It will convertgiven string to lower case and provide new string
	     
	     //8)toUpperCase
	     System.out.println(name.toUpperCase());
	     
	     //9)Split  convert string into arrays
	     String cars="Maruti,Ferrai,Bmw,Lamborghini";
	     String allCars[]=cars.split(",");
	     for(String e:allCars) {
	    	 System.out.println(e);
	     }
	     
	     //10)length  //PRovide the length of string
	     System.out.println(name.length());
	     
	     //11)contains
	     System.out.println(name.contains("Vivek"));//It will  return boolean if it contains the name
	}

}
