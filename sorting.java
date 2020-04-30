import java.io.*;
import java.util.*;
      public class Main{
       public static void main(String args[]){
           Scanner in=new Scanner(System.in);
		   int n=in.nextInt(),temp=0;
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++){
			   arr[i]=in.nextInt();
		   }
		   for(int i=0;i<n-2;i++){
			   if(i%2 == 0){
					if(arr[i] < arr[i+2]){
						temp=arr[i];
						arr[i]=arr[i+2];
						arr[i+2]=temp;
					}
			    }
				else {
					if(arr[i] > arr[i+2]){
						temp=arr[i];
						arr[i]=arr[i+2];
						arr[i+2]=temp;
					}
				}
		    }
	    }
	}