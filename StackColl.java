import java.util.*;
public class StackColl{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> tmpstk=new Stack<Integer>();
		int n=in.nextInt(),temp;
		for(int i=0;i<n;i++){
			stk.push(in.nextInt());
		}
		System.out.print(stk);
		while(!stk.empty()){
			temp=(Integer) stk.pop();
			if(!tmpstk.empty()){
				if(temp>tmpstk.peek())
				tmpstk.push(temp);
				else if(tmpstk.peek()>temp){
					stk.push(tmpstk.pop());
					stk.push(temp);
				}
			}
			else
				tmpstk.push(temp);
		}
		System.out.print(tmpstk);
	}
	
}