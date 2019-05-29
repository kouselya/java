import java.io.*;
import java.util.*;
public class Arr{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int inp[]=new int[n];
		int max=0,k=-1;
		for(int i=0;i<n;i++) {
			inp[i]=in.nextInt();
		}
		Arrays.sort(inp);
		max=inp[n-1]+1;	
		for(int j=1;j<max;j++){
		for(int i=0;i<inp.length;i++){
			
			if(j==inp[i]){
			k=inp[i];
			break;
			}
			else{
			k=-1;}
		}
			System.out.print(k+" ");
		}	

	}
}