import java.io.*;
import java.util.*;
public class seqOfZeros{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String arr[]=str.split("");
		int count=0,max=0,n=str.length();
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i].equals("1")){
				for(int j=i+1;j<n;j++)
				{
				if(arr[j].equals("0"))
				count++;
				else if(arr[j].equals("1"))
				{
				if(count>max)
				max=count;
				count=0;
				}
			}
			
			}				
		}

			System.out.println(max);

	}
}