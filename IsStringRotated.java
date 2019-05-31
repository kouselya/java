import java.io.*;
import java.util.*;
public class IsStringRotated{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str1=in.next();
		String arr[]=str.split("");
		String res="";
		int k=0;
		while(k==2){
		for(int i=0;i<arr.length-1;i++){
			res+=arr[i];
			}
			++k;
		}
		System.out.print(res);
		char ch=str1.charAt(0);
		int ind=res.indexOf(ch);
		String substring=res.substring(ind,ind+(Str1.length()+1));
		if(str1.equals(substring))
			System.out.print("true");
		else
			System.out.print("false");
		
	}
}

