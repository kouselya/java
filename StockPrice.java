import java.util.*;
import java.io.*;
public class StockPrice{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int stock[]=new int[n];
			for(int i=0;i<n;i++){
				stock[i]=in.nextInt();
			}
			int min=stock[0],max=stock[n-1],j=stock.length-1,i=0;
			    int d1=0,d2=0;

                        while(i<j){
                        if(min>stock[i]){
                        min=stock[i];
                        d1=i;
                        }
                        if(max<stock[j]){
                        max=stock[j];
                        d2=j;
                        }
                        i++;
                        j--;
                        }
             	
			System.out.println("Day of buying:"+(d1+1));
			System.out.println("Day of selling:"+(d2+1));
			
	}			
}
/*[ 10, 6, 12, 10, 14, 4]
Day of buying: 2

Day of selling: 5
*/