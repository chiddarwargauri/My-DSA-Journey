package string.com;
import java.util.*;
public class BasicReverseString {
	
	public static void main(String args[]) {
		
		
		 Scanner sc= new Scanner(System.in) ;
		 
		 System.out.println("Enter string :-");
		 
		 String s1=sc.nextLine();
		 
		 String reverse=" ";
		 
		 for(int i=s1.length()-1;i>=0;i--) {
			 
			  reverse+=s1.charAt(i);
		 }
		 
		 System.out.print("Reverse String :-"+reverse);
			 
			 sc.close();
		
	}

}
