import java.util.*;
public class duplicate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=sc.nextLine();
int count=0;
if(s.length()==s1.length())
{
for(int i=0;i<s.length();i++)
{
for(int j=0;j<s1.length();j++)
{
if(s.charAt(i)==s1.charAt(j))
{
count++;}}}}
if(count==s.length())
System.out.println("anagram");
}}