package breakpr.com;

/*2. Write a program to print numbers from 1 to 50, but stop and exit the loop as soon as you 
encounter a multiple of 7. Use the break statement within a while loop. */

public class BreakMultipleBySeven {
    public static void main(String[] args) {
		int i=1;
    	while(i<=50) {
    		if(i%7==0) {
    			
    		break;}
    		System.out.println(i);
    		i++;
    	}
    	
	}
}
