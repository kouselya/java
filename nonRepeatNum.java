import java.io.*;
import java.util.*;
public class nonRepeatNum{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
      int count=0;
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
          for(int j=0;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }             
              }
               if(count==1){
                    System.out.print(arr[i]);
			return;
			}
              count=0;     
        }
        
    }
}