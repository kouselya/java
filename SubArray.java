import java.util.*;
public class SubArray{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int l=0;l<n;l++) {
			arr[l]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum+=arr[i]+arr[j];
				if(sum==0){
				return;
				}
				else
				sum=0;	
			}
		}
		if(sum==0)
		System.out.print("true");
		else
		System.out.print("false");
	
		
}
}