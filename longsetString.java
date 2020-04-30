
import java.io.*;
import java.util.*;
public class longsetString{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        char str1[]=in.nextLine().toCharArray();
        char str2[]=in.nextLine().toCharArray();
        char str3[]=in.nextLine().toCharArray();
        ArrayList<Character> ar=new ArrayList<Character>();
         ArrayList<Character> ar1=new ArrayList<Character>();
          ArrayList<Character> ar2=new ArrayList<Character>();
        for(int i=0;i<str1.length;i++){
            ar.add(str1[i]);
        }
       for(int i=0;i<str2.length;i++){
            ar1.add(str2[i]);
        }
       for(int i=0;i<str3.length;i++){
            ar2.add(str3[i]);
        }
       ar2.retainAll(ar1);
       ar2.retainAll(ar);
       System.out.print(ar2);
    }
}