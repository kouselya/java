import java.io.*;
import java.util.*;
public class SearchEle{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
            arr[i][j]=in.nextInt();
			}
        }
		int k=in.nextInt();
		for(int i=0;i<n;i++){
			int len=arr.length-1;
				if(arr[i][len]>k){
					for(int j=0;j<n;j++){
					if(arr[i][j]==k){
					System.out.print("true" +" "+i+" "+j);
					return;
					}
				}
			}
		}
		System.out.print("false");
	}
}