import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
        String str[]=str1.split(" ");
        int k=in.nextInt();
        if(k <= str.length){
            for(int i=0;i<str.length;i++){
                if(i == (k-1))
                {
                    String temp=str[k-1];
                    String rev="";
                    for(int j=temp.length()-1;j>=0;j--)
                        rev+=temp.charAt(j);
                    str1=str1.replace(str[k-1],rev);
                     System.out.println(str1);  
                }
            }
          
        }
        else
            System.out.println(-1);
    }
}