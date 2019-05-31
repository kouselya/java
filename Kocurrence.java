import java.io.*;
import java.util.*;
public class Kocurrence{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int k=in.nextInt();
	  int arr[]=new int[n];
	  int count=0;
	  for(int i=0;i<n;i++){
		  arr[i]=in.nextInt();
	  }
	  for(int i=0;i<n;i++){
		  for(int j=0;j<n;j++){
				if(arr[i] == arr[j])
					count++;
		}
				if(count == k){
					System.out.print(arr[i]);
					break;
				}
				else
					count=0;
			
	  }
	}
}
	  