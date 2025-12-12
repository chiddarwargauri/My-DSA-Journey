package searchingelement.com;
import java.util.*;
public class LinearSerch {

	   public static void main (String args[]) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of the array :");
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   System.out.println("Enter the array element :- ");
		   for(int i=0;i<n;i++ ) {
			   
			   arr[i]=sc.nextInt();
		   }
		   
		   
		   System.out.println("---------------------------now start the Linear Search ------------------------");
		   
		   System.out.println("Enter the element which you want to search:");
		   
		   boolean flag=false;
		   int item=sc.nextInt();
		   
		   
		   
		   for(int i=0;i<n;i++) {
			   
			   if(arr[i]==item) {
				   
				   flag=true;
                 System.out.println("Element is found at "+i);				   
				   break;
				   
			   }
			   
			  
		   }
		   
		   if(flag==false) {
			  System.out.println("Element not found ");
		   }
		   
		   sc.close();
	   }
}
