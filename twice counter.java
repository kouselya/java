import java.io.*;
import java.util.*;
      public class Main{
       public static void main(String args[]){
           Scanner in=new Scanner(System.in);
              int cnt=0;
               HashMap<String,Integer> hm=new HashMap<String,Integer>();
            String str="java c bigdata machine assermbly perl compiler java c bigdata c perl python python perl c";
            String strarr[]=str.split(" ");
            for(int i=0;i<strarr.length;i++){
                for(int j=0;j<strarr.length;j++){
                    if(strarr[i].equals(strarr[j])){
                        cnt++;
                    }
                }
                if(cnt == 2){
                    hm.put(strarr[i],cnt);
                }
                cnt=0;
            }
            hm.forEach((k,v)->System.out.println(k));
        }
    }
