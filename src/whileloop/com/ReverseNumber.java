package whileloop.com;
import java.util.Scanner;
public class ReverseNumber {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any Number ");
	   int num=sc.nextInt();
	   int rev=0;
	   while(num>0) {
		   
		   int lastNumber=num%10;
		   rev=rev*10+lastNumber;
		   num=num/10;		   
	   }
	   
	   System.out.println(rev);
	   
	   sc.close();
   }  
}
