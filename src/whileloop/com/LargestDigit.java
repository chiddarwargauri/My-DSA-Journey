package whileloop.com;
import java.util.Scanner;
public class LargestDigit {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
	    int num=sc.nextInt();
	    int largestDigit=0;
	    while(num>0) {
	    	
	    	int lastnumber=num%10;
	    	if(lastnumber>largestDigit) {
	    		largestDigit=lastnumber;
	    		
	    		
	    	}
	    	num=num/10;
	    	
	    }
	    System.out.println("Largest digit is :-" +largestDigit);
	    
	    sc.close();
	    
	}

}
