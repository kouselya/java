import java.io.*;
import java.util.*;
public class repeat{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String arr[]=str.split("");
		int count=1;
		for(int i=0;i<arr.length;i++){
		if(i+1<arr.length){
			if(arr[i].equals(arr[i+1])) {
			++count;
			}
			else{
			System.out.print(arr[i]+count);
			count=1;
			}
		}
		else{
			System.out.print(arr[i]+count);
			count=1;
			}
		}
	}
}