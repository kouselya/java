import java.util.*;
import java.io.*;
public class PogoJumpToEnd{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	int cnt=1,hop=0;
	  for(int i=0;i<n;i++){
		  arr[i]=in.nextInt();
	  }
	  for(int i=0;i<n-1;i++){
	 if(arr[i+1]!=arr[i] && arr[n-1]== 0){
			 cnt++;
		  }
		/*  hop=arr[0];
		  if(arr[hop] == 0 && (n-1)==hop )
			  cnt=n;*/
	}
	if(cnt == n)
		System.out.print("True");
	else 
		System.out.print("false");
}
}
