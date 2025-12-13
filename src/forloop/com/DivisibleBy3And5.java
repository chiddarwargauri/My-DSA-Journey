package forloop.com;
//13. Print Numbers Divisible by 3 and 5 from 1 to 100 

public class DivisibleBy3And5 {
 
	public static void main(String[] args) {
		for(int i=15;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
	}
	
}
