package forloop.com;
//11. Print Sum of Odd Numbers between 1 and 20 

public class SumOdd {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
