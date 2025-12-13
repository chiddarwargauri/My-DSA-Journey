package continuepr.com;

/*3. Write a program to print numbers from 1 to 50. Skip numbers that are divisible by both 3 and 4 
using the continue statement within a for loop. */
public class SkipMultipleThreeAndFour {
    public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%3==0&&i%4==0) {
                   continue;			}
			System.out.println(i);
		}
	}
}
