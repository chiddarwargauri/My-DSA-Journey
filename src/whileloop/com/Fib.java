package whileloop.com;

public class Fib {
	
	public static void main(String args[]) {
		
		int a = 0;
		int b = 1;
		int i = 3;

		System.out.println(a);  // 0
		System.out.println(b);  // 1
       		
		while(i <= 10) {
		    
			int c = a + b;
			System.out.println(c);
			
			a = b;
			b = c;
			
			i++;
		}
	}
}
