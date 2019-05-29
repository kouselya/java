import java.util.*;
public class ReverseInPlace{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=0,count=0,i=0,j=n-1;
		int[] arr=new int[n];
		for(int l=0;l<n;l++) {
			arr[l]=in.nextInt();
		}
		while(i<=j) {
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		for(int k=0;k<n;k++){
			System.out.print(arr[k]+" ");
		}
 	}
}