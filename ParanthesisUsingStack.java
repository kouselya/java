import java.util.*;
public class ParanthesisUsingStack{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Stack<Character> stk=new Stack<Character>();
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i] == '(')
			stk.push(ch[i]);
			else if(!stk.empty() && ch[i] == ')'){
			stk.pop();
			count+=2;
			}
		}
		System.out.print(count);
		
	}
	
}