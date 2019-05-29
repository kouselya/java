import java.io.*;
import java.util.*;
public class IsRotatedArray{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str1=in.next();
		String arr[]=str.split("");
		String res="";
		int k=0;
		while(k<=1) {
		for(int i=0;i<arr.length;i++) {
			res+=arr[i];
		}
		k++;
		}
	
		int ind=res.indexOf(str1.charAt(0));
		String sub=res.substring(ind,ind+(str1.length()));
		if(str1.equals(sub))
			System.out.print("true");
		else
			System.out.print("false");
	}
}//res.contains(str1)