import java.util.*;
public class Leaf{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[]  arr=new int[20];
int[] ar=new int[3];
System.out.println("Enter the values");
int n=sc.nextInt();
int count=0;
for(int i=0;i<n;i++)
{
arr[i]=i;
}
for(int i=0;i<n;i++){System.out.print(arr[i]);}
System.out.println("Enter the number of caterpillars");
int c=sc.nextInt();
System.out.println("Enter the Jumping factors");
int jf=0;
for(int j=0;j<c;j++)
{
jf=sc.nextInt();
for(int i=jf;i<n;i+=jf){
arr[i]=-1;
}

}
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
if(arr[i]!=-1)
count++;
}
System.out.println("the count is"+count);
}
}