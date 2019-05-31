import java.util.*;
import java.io.*;
public class MoveSpace
{
	public static void main(String args[])
	{
		Scanner in=new 	Scanner(System.in);
		String s=in.nextLine();
		String str[]=s.split(" ");
		int len=str.length;
		String res="";
		for(int i=0;i<len-1;i++)
		{
			res+=" ";
		}
			System.out.println(res+s.replaceAll(" ",""));
	}
}