package whileloop.com;

import java.util.Scanner;

public class Ispalindrome {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		
		int ori=n;
		int rev=0;
		while(n>0) {
			int LastNumber=n%10;
			rev=rev*10+LastNumber;
			n=n/10;
			
		}
		if(rev==ori) {
			System.out.println( "this is a palindrome");
		}
		else {
			System.out.println( "this is not a palindrome");

		}
		
		sc.close();
		
	}

}
