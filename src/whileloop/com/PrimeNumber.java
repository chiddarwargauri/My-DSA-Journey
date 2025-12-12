package whileloop.com;
import java.util.Scanner;
public class PrimeNumber {
  public static void main(String args[]) {
	  int i=2;
	  boolean isPrime=true;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter any number");
	  int num=sc.nextInt();
	  while(i <=num/2) {
		  
		  if(num%i==0) {
			  isPrime=false;
			  break;
		  }
		  i++;
	  }
	  
	  if(isPrime==true) {
		  System.out.println("Number is Prime");
	  }
	  else {
		  System.out.println("Number is not Prime");
	  }
	  sc.close();
	  
	  
  }
}
