import java.io.*;
import java.util.*;
public class  MaxProduct{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
		  arr[i]=in.nextInt();
	  }
	  Arrays.sort(arr);
	  int max=arr[arr.length-1];
	 // System.out.print(max);
	  int smax=arr[n-2];
	  int maxprod=max*smax;
	  System.out.print( maxprod);
	}
}