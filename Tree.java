import java.util.Scanner;
import java.io.*;
public class Tree{
		public static void main(String[] args) {
			int n,max=0,smax=0,count=0,count1=0;
			Scanner in=new Scanner(System.in);
			n=in.nextInt();
			int[] ind=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
				}
			for(int i=0;i<n;i++) {
				if(i+1<n) {
					if(a[i]<=a[i+1]) {
						++count;
					}
					else
						ind[i]=i;
				}
			}
			for(int i=0;i<n;i++) {
				max=a[0];
				if(a[i]>max)
					max=i;
			}for(int i=0;i<n;i++) {
				smax=a[0];
				if(smax<max && a[i]>smax)
					smax=i;
			}for(int i=0;i<n;i++) {
				if(ind[i]>=1 && ind[i]<=n-2)
					++count1;
			}
			if(count1>1)
				return 0;
			else 
				return count;
		}
}
				