package string.com;

import java.util.*;

public class Anagram {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=sc.nextLine();
		System.out.println("Enter Second String:");
		String s2=sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("not anagram");
		}
		
		char[] c1=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Srings are anagram");
		}
		
		
	}
}
