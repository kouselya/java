import java.io.*;
import java.util.*;
      public class Main{
       public static void main(String args[]){
           Scanner in=new Scanner(System.in);
		   String str=in.nextLine(),res="";
		   String arr[]=str.split("");
		   for(int i=arr.length-1;i>0;i--){
			   res+=arr[i]+" ";
		   }
		   System.out.println(res);
	   }
	  }