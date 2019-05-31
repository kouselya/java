import java.util.*;
import java.io.*;
public class LongestConsecutiveSequence {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	int arr[]=new int[n];
	int cnt=1,max=0;
	  for(int i=0;i<n;i++){
		  arr[i]=in.nextInt();
	  }
	  Arrays.sort(arr);
	  for(int i=0;i<n;i++){
		   for(int j=i+1;j<n-1;j++){
				if(arr[j]-arr[i]==1)
					cnt++;
		   }
			if(max<cnt)
			max=cnt;
		else
			cnt=0;
	  }
	 System.out.println(max);
	}
}