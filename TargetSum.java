import java.util.*;
import java.io.*;
public class TargetSum{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int s=in.nextInt();
		int count=0,sum=0;
		for(int i=0;i<n;i++) {
			sum=-arr[i];
			for(int j=0;j<n;j++) {
			if(i != j)
			sum+=arr[j];
			}
			if(sum==s)
			count++;
			else 
			sum=0;
		}
		System.out.println(count);
	}
}
