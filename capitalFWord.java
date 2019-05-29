import java.io.*;
import java.util.*;
public class capitalFWord{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
		String org=arr[i];
		String res="";
		for(int j=0;j<org.length();j++){
		res=Character.toString(org.charAt(0));
		}
		System.out.print(res.toUpperCase()+org.substring(1)+" ");
		}
	}
}