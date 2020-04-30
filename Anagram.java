import java.io.*;
2	import java.util.*;
3	public class Main{
4	    public static void main(String args[]){
5	        Scanner in=new Scanner(System.in);
6	        String str="LISTEN",strr="SILENT";
7	        String str1[]=str.split("");
8	        String str2[]=strr.split("");
9	        int cnt=0;
10	        if(str1.length == str2.length){
11	            for(int i=0;i<str1.length;i++)
12	            {
13	                for(int j=0;j<str2.length;j++)
14	                {
15	                    if(str1[i] == str1[j])
16	                        cnt++;
17	                }
18	            }
19	        }
20	        else
21	           System.out.println("Not a Anagram");
22	        if(cnt == str1.length)
23	            System.out.println("Anagram");
24	        else
25	            System.out.println("Not a Anagram");
26	    }
27	}