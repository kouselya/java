import java.io.*;
import java.util.*;
public class RemoveChar{
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			String str=in.next();
			String str1=in.next();
			String arr[]=str.split("");
			String arr1[]=str.split("");
			String res[],res1[]="";
			//int len=str.length();
			//int len1=str1.length();
			int count=0;
			for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<=arr1.length-1;j++) {
					res=Character.toString(str1.charAt(j));
					res1=str.replaceall(res,"");
				System.out.print(str[i].res1.toCharArray());
				}
			}
			
	}
}