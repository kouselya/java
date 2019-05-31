import java.util.*;
public class GreatestMultiply{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int testcase = s.nextInt();
	int i,j,n,max;
	do{
		System.out.println("Enter the size");
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
			}
		for(i=1;i<a.length-1;i++){
			max=0;
			for(j=i+1;j<a.length;j++){
				if(a[j]>max)
					max=a[i];
				a[j]=max;
			}
			a[n-1]=-1;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		testcase--;
	}while(testcase>0);
}
}
					
				