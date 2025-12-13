package continuepr.com;

/*1.  Write a program to print the odd numbers from 1 to 20 using a for loop. Use the continue 
statement to skip even numbers.*/
public class SkipEven {
	
      public static void main(String[] args) {
    		for(int i=1;i<=20;i++) {
    			
    		   if(i%2==0) {
    			   continue;
    		   }
    		   System.out.println(i);
    		}

	}
}
