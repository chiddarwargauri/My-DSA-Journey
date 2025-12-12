package whileloop.com;
import java.util.Scanner;
public class SumDigit {
   public static void main(String args[]) {
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Any number");
	   int num=sc.nextInt();
	   int sum=0;
	   
	   while(num>0) {
		   
		   int lastnumber=num%10;
		   sum+=lastnumber;
		   num=num/10;
	   }
	   System.out.println(sum);
	   sc.close();
   }
}
