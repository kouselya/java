import java.io.*;
import java.util.*;
public class Pattern
{
public static void main(String args[])
{
int i,j,count=1,start=0,end=0;
Scanner in=new Scanner(System.in);
int rows=in.nextInt();
for(i=rows;i>=1;--i)
{
	end=((i*(i+1))/2);
	//System.out.println(end);
	
for(j=end-(i-1);j<=end;++j)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}