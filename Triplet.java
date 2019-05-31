import java.io.*;
import java.util.*;
public class  Triplet{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
		int arr1[]=new int[n];
		int sum=0;
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
		for(int i=0;i<n;i++) {
            arr1[i]=arr[i]*arr[i];
        }
		for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					sum=arr[i]*arr[i]+arr[j]*arr[j];
					for(int k=0;k<arr1.length;k++){
						if(sum == arr1[k]){
							System.out.print("yes");
						return;
						}
					}
				}
				sum=0;
		}
		System.out.print("no");
	}
}