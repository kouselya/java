import java.util.*;
public class FirstRepeat{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int l=0;l<n;l++) {
			arr[l]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
				System.out.print(arr[i]);
				return;
				}	
			}
		}
	
		
}
}