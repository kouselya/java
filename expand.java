import java.io.*;
import java.util.*;
public class expand{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char arr[]=str.toCharArray();
		char alpha[]=new char[arr.length];
		String num[]=new String[arr.length-alpha.length];
		char res[]=new char[arr.length];
		int count=0,j=0,k=0,l=0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isLetter(arr[i])) {
			alpha[j]=arr[i];
			++j;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				if(Character.isDigit(arr[i-1])){
					num[k]=arr[i-1]+arr[i];
					++k;
					}
				else{
					num[k]=arr[i];
					++k;
					}
			}
		}
		for(int i=0;i<alpha.length;i++) {
		
				res[k]=alpha[i];
				++count;
				if(count==1){
				res[k]=Integer.parseInt(num[l]);
				++j;
				}
				else 
				count=0;
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]);	
		
		
	}
}