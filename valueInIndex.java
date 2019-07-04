import java.io.*;
import java.util.Scanner;
class valueInIndex{
 public static void main(String args[]) {
	int arr[]=new int[100];
	int n,temp=0,len=0,j=0,count=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(arr[i]>arr[j]){
			temp=arr[i];		
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	len=arr[n-1];
	int b[]=new int[len];
	System.out.println(len);
	for(int i:b)
		i=-1;
	for(int i=0;i<b.length;i++){
		if(arr[j]!=i){
		++count;
		}
		else
		b[i]=count;
		
	}
	for(int i:b)
	System.out.println(i);
}
}