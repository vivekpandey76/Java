package stringIntroduction;

import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		//The string is called anagram if the same number of character repeated same time 
		//eg vivek kvvie 2)literal laeiltr
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
		String string1=sc.nextLine();
		System.out.println("Enter the string2");
		String string2=sc.nextLine();
		boolean isAnagram=false;
		boolean visited[]=new boolean[string2.length()];
		if(string1.length()==string2.length()) {
			for(int i=0;i<string1.length();i++) {
				isAnagram=false;
				char c=string1.charAt(i);
				for(int j=0;j<string2.length();j++) {
					if(string2.charAt(j)==c && !visited[j]) {
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
			if(isAnagram) {
				System.out.println("Is anagram");
			}else
				System.out.println("Is not anagram");
		}
		
	}

}
