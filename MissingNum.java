import java.io.*;
import java.util.*;
public class MissingNum{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
      int sum=0;
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
	for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
	int tot=(n*(n+1))/2;
	System.out.print(tot-sum);
	}
}