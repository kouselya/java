import java.io.*;
import java.util.*;
public class  SplitIronRod{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int len=in.nextInt();
int x=in.nextInt();
int y=in.nextInt();
int z=in.nextInt();
int r1=len%x,seg1=len/x;
if(r1!=0){
if(r1%y==0)
seg1++;
else if(r1% z==0)
seg1++;
}
int r2=len%y,seg2=len/y;
if(r2!=0){
if(r2%x==0)
seg2++;
else if(r2%z==0)
seg2++;
}
int r3=len%z,seg3=len/z;
if(r3!=0){
if(r3%x==0)
seg3++;
else if(r3%y==0)
seg3++;
}
int arr1[]={seg1,seg2,seg3};
Arrays.sort(arr1);
System.out.print(arr1[2]);
}
}