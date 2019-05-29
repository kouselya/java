import java.io.*;
import java.util.*;
public class ArrayPartition{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int k=in.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<k)
				System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==k)
				System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>k)
				System.out.print(arr[i]+" ");
		}
	}
}