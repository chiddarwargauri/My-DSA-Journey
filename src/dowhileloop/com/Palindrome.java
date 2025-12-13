package dowhileloop.com;
//4. Write a Java program to check if a given number is a palindrome using a do-while loop. 

import java.util.Scanner;

public class Palindrome {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	int num=sc.nextInt();
	int rev=0;
	int original=num;
	int sign=num<0?-1:1;
	num=Math.abs(num);
	
	do {
		int ln=num%10;
		rev=rev*10+ln;
		num/=10;
	}while(num>0);
	if(rev*sign==original) {
		System.out.println("This number is palindrome");

	}
	
	
	
	else {
		System.out.println("This number is not palindrome");

	}
	sc.close();
}
}
