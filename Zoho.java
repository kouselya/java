import java.io.*;
import java.util.*;
public class Zoho{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
      //String str="program";
        int l=0,m=str.length()-1;
        if(str.length()%2 != 0 ){
            for(int i=0;i<str.length();i++){
                for(int j=0;j<str.length();j++){
                  if(m>=0){
                        if(j == l)
                        System.out.print(str.charAt(l));
                        else if( j == m)                        
                        System.out.print(str.charAt(m));
                        else
                        System.out.print(" ");
                  }
                }
                 l++;
                 m--;
                System.out.println("");
            }
        }
    }
}