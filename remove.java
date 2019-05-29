import java.util.*;
public class remove
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int count=0;
String str1[]=s1.split("");
String str2[]=s2.split("");
for(int i=0;i<str2.length;i++)
{
for(int j=0;j<str1.length;j++)
{
if(str1[j].equals(str2[i]))
count++;
}
if(count==0)
{
System.out.println(str2[i]);
count=0;
}
else
count=0;
}}}