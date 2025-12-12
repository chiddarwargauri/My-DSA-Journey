package whileloop.com;
import java.util.Scanner;
public class FactGivenNumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter any number ");
	
	int number =sc.nextInt();
	int i=1;
	int fact=1;
	while(i<=number){
		
		fact*=i;
		
		i++;
		
	}
	System.out.println(fact);
	sc.close();
}


}
