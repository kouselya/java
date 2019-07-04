import java.io.*;
import java.util.Scanner;
public class Rotate{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,j=0,count=0,ind=0,len;
		int[] a=new int[10];
		int[] b=new int[20];
		int[] c=new int[20];
		n=in.nextInt();
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		while(j<=2*n){
			for(int i=0;i<n;i++){
			b[j]=a[i];
			j++;
			}
		}
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		len=c.length;
		for(int i=0;i<n;i++){
			if(a[i]==c[0])
				ind=i;
		}
		for(int i=ind;i<2*n;i++){
			if(a[i]==c[i])
				++count;
		}
		if(count==len)
			System.out.println("true");
		else
			System.out.println("false");
		}
	}

			