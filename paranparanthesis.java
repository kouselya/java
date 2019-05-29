import java.io.*;
import java.util.*;
public class paranthesis{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String inp=in.next();
		String str[]=inp.split("");
		int flag=1,flag1=1,flag2=1;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("(")){
				++flag;
			}
else if(str[i].equals("["))
{
	++flag1;
}
else if(str[i].equals("{"))
{
	++flag2;
}
else if(str[i].equals(")"))
{
	--flag;
}
else if(str[i].equals("}"))
{
	--flag1;
}
else if(str[i].equals("]"))
{
	--flag2;
}
		}
		if(flag==1&&flag1==1&&flag2==1)
			System.out.print("balanced");
		else
			System.out.print("unbalanced");
	}
}