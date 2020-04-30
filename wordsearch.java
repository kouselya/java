import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
		String[] str=in.nextLine().split(" ");
		int k=in.nextInt();
		if(k <= str.length){
			for(int i=0;i<str.length;i++){
				if(i == (k-1))
				{
					String temp=str[k-1];
					for(int j=temp.length()-1;j>=0;j--)
						temp+=charAt(j);
				}
			}
		}
		else
			System.out.println(-1);
	}
}