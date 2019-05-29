import java.io.*;
import java.util.*;
public class twice{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String inp=in.nextLine();
		String str[]=inp.split(" ");
		int count=0;
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j]))
				count++;
			}		
			if(count==1){
			System.out.println(str[i]);
			count=0;
			}
else 
count=0;
		}
	}
}