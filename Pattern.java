import java.io.*;
import java.util.Scanner;
public class Pattern{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,num=1;
		n=in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
				}
			for(int k=0;k<=i;k++){
				System.out.print(" "+num);
				++num;
				}
				System.out.println();
		}
		for(int i=n;i>=0;i--){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
				}
			for(int k=0;k<=i;k++){
				System.out.print(" "+num);
				++num;
				}
				System.out.println();
		}
	}
}
			