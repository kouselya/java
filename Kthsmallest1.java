import java.io.*;
import java.util.*;
public class Kthsmallest1{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int k=in.nextInt();
		Arrays.sort(arr);
		System.out.print(arr[k-1]);
		//for(int i=0;i<n;i++) {
		}
		}