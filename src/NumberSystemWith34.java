import java.util.*;

public class NumberSystemWith34 {
	public static void main(String[] args) {
		int n = 10;
		
		Deque<Integer> q = new ArrayDeque<>();
		q.add(3);
		q.add(4);
		
		int i = 1;
		while(true) {
			int val = q.remove();
			if(i == n) {System.out.println(val); break;}
				
			q.add(val * 10 + 3);
			q.add(val * 10 + 4);
			i++;
		}
		
		
	}
}
