package operators;

public class NestedIfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=13,b=14,c=45;
        int result=a>b?a>c?a:c:b>c?b:c;  //By using ternary operator
//        By using Normal method
//        if(a>b) {
//        	if(a>c) {
//        		result=a;
//        	}else {
//        		result=c;
//        	}
//        }else {
//        	if(b>c) {
//        		result=b;
//        	}else {
//        		result=c;
//        	}
//        }
        
      System.out.println("THe largest number in this are "+result);
	}

}
