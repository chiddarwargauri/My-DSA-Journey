package forloop.com;
//10. Print Sum of Even Numbers between 1 and 20 

public class SumEven1to20 {
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=20;i=i+2) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
