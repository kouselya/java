import java.util.*;
public class Heart{
  public static void main(String args[]){
    int n;//should be 5 or 7 or 9
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
    int i,j,m=0;
    i=1;
    while(i<=n){
      if(i==1){
        for(j=1;j<=n;j++){
          if(j==1||j==n||j==n/2+1){
            System.out.print("  ");}
            else{
              System.out.print("* ");}
        }
        i++;
        System.out.println();
      }
      else if(i<=n/2+1){
        if(i==2){
          for(j=1;j<=n;j++){
            if(j==1||j==n||j==n/2+1){
              System.out.print("* ");}
              else{
              System.out.print("  ");}
          }
        }
        else{
          for(j=1;j<=n;j++){
            if(j==1||j==n){
              System.out.print("* ");}
            else
              System.out.print("  ");
          }
        }
        i++;
        System.out.println();
      }
      else{
        m=1;
        while(m<=n/2){
          for(j=1;j<=n;j++){
            if(j==n-m||j==m+1)
            System.out.print("* ");
            else
            System.out.print("  ");
          }
          m++;
          i++;
          System.out.println();
        }
      }
    }
  }
  }


