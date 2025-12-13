package continuepr.com;

/*2. Write a program to print numbers from 1 to 30, but skip numbers that are multiples of 5. Use the 
continue statement within a while loop. */

public class SkipMultipleofFive {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			if(i%5==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}
}
