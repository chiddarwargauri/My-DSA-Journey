package dowhileloop.com;

import java.util.Scanner;

public class SumDigit {
	//2. Write a Java program to calculate the sum of digits of a given number using a do-while loop. 

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		num=Math.abs(num);
		int sum=0;
		
		do {
			int lastNum=num%10;
			sum+=lastNum;
			num/=10;
			
		}while(num>0);
		
		System.out.println(sum);
		
		sc.close();
	}

}
