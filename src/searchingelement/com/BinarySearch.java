package searchingelement.com;
import java.util.*;
public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:- ");	
	    int n=sc.nextInt();
	    int arr[]=new int[n];
		System.out.println("Enter element in array:- ");
	    for(int i=0;i<n;i++) { 	
	     arr[i]=sc.nextInt()
;	    }
	    System.out.println("This is the array element");
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i] +" ");
	    }
	    System.out.println("");
	    System.out.println("------------------------Now start the binary search-------------------------");
	    System.out.println("Step no:1 ---> Arrange the array in ascending order:-");
	    Arrays.sort(arr);
	    System.out.println("Here is our sorted array "+Arrays.toString(arr));
	   int low=0;
	   int high=n-1;
	   int mid =0;
	   System.out.println("Enter the target value:");
	   int target=sc.nextInt();
	   boolean flag=false;
	   while(low<=high) 
	   {
		   mid=(low+high)/2;
		   if(arr[mid]==target) {
			   flag=true;
			   System.out.println("Element found at "+mid);
			   break;   
		   }
		   else if(arr[mid] >target) {		   
			   high = mid - 1		;
					   }	   
		   else if(arr[mid]<target) {
			   
			   low=mid+1;
		   }	   
	   }
	   
	   if(flag==false) {
		   
		   System.out.println("Element not found");
	   }
	   
	   sc.close();
	}
}
