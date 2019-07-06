import java.util.*;
public class Paranthesis{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		char str[]=in.nextLine().toCharArray();
		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i<str.length;i++){
			if(str[i] == '(' || str[i] == '{'|| str[i] == '['){
				stk.push(str[i]);
			}
			else if(!stk.isEmpty()){
				if(str[i] == ')' && stk.peek()=='(')
					stk.pop();
				if(str[i] == '}' && stk.peek()=='{')
					stk.pop();
				if(str[i] == ']' && stk.peek()=='[')
					stk.pop();
			}
			else
				break;	
		}
		if(stk.isEmpty())
			System.out.print("Balanced");
		else
			System.out.print("Not Balanced");
	}
}