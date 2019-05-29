import java.io.*;
import java.util.*;
public class Chess {
	
	public static void main(String args[]) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int row=0;
		int col=0;
		boolean king=true;
		String res[][]=new String[9][9];
		for(int i=1;i<=8;i++){
				for(int j=1;j<=8;j++){
						res[i][j]="0";
						
				}
			}
		for(int i=0;i<n;i++) {
			row=in.nextInt();
			col=in.nextInt();
				markPos(res,row-2,col-1);
				markPos(res,row-2,col+1);
				markPos(res,row+2,col-1);
				markPos(res,row+2,col+1);
				markPos(res,row-1,col-2);
				markPos(res,row+1,col-2);
				markPos(res,row-1,col+2);
				markPos(res,row+1,col+2);
			}
		if (king) {
		int rowk=in.nextInt();
		int colk=in.nextInt();
				markPosk(res,rowk-1,colk-1);
				markPosk(res,rowk-1,colk);
				markPosk(res,rowk-1,colk+1);
				markPosk(res,rowk,colk-1);
				markPosk(res,rowk,colk+1);
				markPosk(res,rowk+1,colk-1);
				markPosk(res,rowk+1,colk);
				markPosk(res,rowk+1,colk+1);
		}
			for(int i=1;i<=8;i++){
				for(int j=1;j<=8;j++){
						System.out.print(res[i][j]+" ");
						
				}
				System.out.println(" ");
			}
			for(int i=1;i<=8;i++){
				for(int j=1;j<=8;j++){
						if(res[i][j].equals("1kki"))
						System.out.print(res[i][j]="1"+" ");
						else
						System.out.print(res[i][j]="0"+" ");
						
				}
				System.out.println(" ");
			}		
			 
	}
	public static void markPos(String res[][],int row,int col) {
					
					if(row>0 && row<=8 && col>=0 && col<=8)
						res[row][col]="1k";
	}
	public static void markPosk(String res[][],int rowk,int colk) {
					if(rowk>0 && rowk<=8 && colk>=0 && colk<=8)
						if (res[rowk][colk]=="0")
						res[rowk][colk]="ki";
						else
						res[rowk][colk]+="ki";
	}		
}
