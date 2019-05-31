import java.util.*;
import java.io.*;
public class geeksCoffee{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
		if(t>=1&&t<=104)
		{
			for(int i=1;i<=t;i++){
				int amt=in.nextInt();
				int n=in.nextInt();
				int unit=0;
					for(int j=0;j<n-1;j++){
						unit=amt/2;
						amt=amt/2;
					}
					System.out.println(unit);
			
			}
		}
	}
}