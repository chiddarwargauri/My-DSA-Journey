package breakpr.com;

/*3. Write a program to print numbers from 1 to 30. Stop printing and exit the loop when you find a 
number greater than 15. Use the break statement within a for loop. */
public class breakNumIsGreaterThan15 {
	
      public static void main(String[] args) {
		
    	  for(int i=1;i<=30;i++ ) {
    		  
    		  if(i>15) {
    			  break;
    		  }
    		  
    		  System.out.println(i);
    		  
    		  
    		  
    	  }
	}
}
