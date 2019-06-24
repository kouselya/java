import java.io.*;
import java.util.*;

public class MainMesoketes{

public static void main(String args[]){
		char dir='a';
		int N=0,S=0,E=0,W=0,stg=0,cnt=0;
		Scanner in=new Scanner(System.in); 
		String str=in.nextLine();
		String s[]=str.split(";");
        for(int i=0;i<s.length;i++)
        System.out.println(s[i]);
        for(int i=0;i<s.length;i++) {
        String s1[]=s[i].split("[:]");
        for(int j=0;j<s1.length;j++)
        System.out.println(s1[j]);
        for(int k=0;k<=s1.length-1;k++){
        int ind=s1[k].indexOf('-');
        ind++;
        dir=s1[k].substring(ind,ind+2).charAt(1);								  	 
        stg=Character.getNumericValue(s1[k].substring(ind+9).charAt(0));
        System.out.println(dir+" "+stg);
		if(dir == 'N' && stg>N){
		N=stg;
		cnt++;
		}
		if(dir == 'W' && stg>W){
		W=stg;
		cnt++;
		}
		if(dir == 'E' && stg>E){
		E=stg;
		cnt++;
		}
		if(dir == 'S' && stg>S){
		S=stg;
		cnt++;
		}
	
	  System.out.println(cnt);
		}
		}
	}
}