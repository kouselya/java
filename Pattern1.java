import java.io.*;
import java.util.Scanner;
public class Pattern1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,num=1;
		n=in.nextInt();
		for(int i=n;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(i%2==0)
				System.out.print(" * ");
				else
					System.out.print(" $ ");
				}
			
				System.out.println();
		}
		
		}
	}

			