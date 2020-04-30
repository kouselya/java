import java.io.*;
import java.util.*;
      public class Main{
       public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           String str=in.nextLine();
           int temp=0;
           String res="",val="";
           String arr[]=str.split("");
           for(int i=0;i<arr.length-1;i++){
               int j=i+1;
               int k=j+1; 
               if(isAlphabet(str.charAt(i))){
                 if(j != arr.length-1){
                   if(isDigit(str.charAt(j)) && !isDigit(str.charAt(k))){
                        temp=Character.getNumericValue(str.charAt(j));
                   }
                   else{
                       val=str.substring(j,k+1);
                       temp=Integer.parseInt(val);
                   }
                 }
                 else{
                   if(isDigit(str.charAt(j))){
                        temp=Character.getNumericValue(str.charAt(j));
                  }
                 } 
              }
               while(temp>0){
                   res+=str.charAt(i);
                   temp--;
               }
           }
           System.out.println(res);
       }
       public static boolean isAlphabet(char c){
           if(c>='A'&& c<='Z'||c>='a'&&c<='z')
           return true;
           else
           return false;
       }
       public static boolean isDigit(char c){
            if(c>='0'&& c<='9')
           return true;
           else
           return false;
       }
     }
	
	