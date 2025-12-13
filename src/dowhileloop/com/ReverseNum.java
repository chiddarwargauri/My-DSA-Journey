package dowhileloop.com;
import java.util.Scanner;
public class ReverseNum {
	//3. Write a Java program to reverse a given number using a do-while loop. 

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num=sc.nextInt();
		int rev=0;
		int sign=num<0?-1:1;
		num=Math.abs(num);
		do {
			int ln=num%10;
			rev=rev*10+ln;
			num/=10;
			
		}while(num>0);
		System.out.println(rev*sign);
		sc.close();
		
		
		
	}

}
