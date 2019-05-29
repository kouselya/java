import java.io.*;
import java.util.*;
public class  GreaterOnRight{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
		int arr1[]=new int[n];
		int max=0;
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
		for(int i=0;i<arr.length-1;i++) {
			max=arr[i+1];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>max){
				  max=arr[j];
				}
			}
			System.out.print(max+" ");
		}	
			System.out.print(-1);
	}
}