package whileloop.com;
import java.util.Scanner;

public class Sumeven {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number ");
		int number=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=number) {
			
			if(i%2==0) {
				
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
		sc.close();
	}
	
	

}
