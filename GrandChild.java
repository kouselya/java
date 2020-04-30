import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("luke","shaw");
        map.put("wayne","rooney");
        map.put("rooney","ronaldo");
        map.put("shaw","rooney");
        
       String str=in.nextLine();
       String son="";
       int cnt=0;
       for(String temp:map.keySet()){			//for getting son
        String t=map.get(temp);
            if(str.equals(t)){
                 son=temp;
                 //System.out.print(son);
            }
        }
         for(String temp:map.keySet()){			//for getting grandson
        String t=map.get(temp);
            if(son.equals(t)){
                 cnt++;
            }
        }
        System.out.print(cnt);
    }
}
