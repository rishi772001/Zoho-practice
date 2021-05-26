import java.util.*;

public class RemoveUnbalancedParanthesis {
	public static int check(String str)
	{
		int count = 0;
		for(char i: str.toCharArray())
		{
			if(i == '(')
				count++;
			else if(i == ')')
				count--;
		}
		return count;
	}
	public static void main(String[] args) {
		String input = "((abc)((de))";
		
		Deque<Character> q = new ArrayDeque<>();
		
		int count = check(input);
		if(count == 0) { System.out.println(input);};
		
		for(char i: input.toCharArray())
		{
			q.add(i);
		}
		
		while(count < 0) {
			q.remove(')');
			count++;
		}
			
		while(count > 0) {
			q.remove('(');
			count--;
		}
		
		while(!q.isEmpty())
			System.out.print(q.remove());
		
		
		
	}
}
