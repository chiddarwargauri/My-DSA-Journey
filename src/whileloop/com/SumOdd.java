package whileloop.com;
import java.util.Scanner;
public class SumOdd {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
		sc.close();
	}

}
