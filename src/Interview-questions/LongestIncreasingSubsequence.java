import java.util.Stack;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int arr[] =  { 3, 1, 11, 5, 7, 6 };
		int n = arr.length;
		int i, j;
		int max[] = new int[n];
		
		for(i = 0; i < n; i++)
		{
			max[i] = 1;
		}
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < i; j++)
			{
				// increases
				if(arr[i] > arr[j])
				{
					max[i] = Math.max(max[i], max[j] + 1); 
				}
			}
		}
		
		int maxi = Integer.MIN_VALUE;
		int maxiIndex = -1;
		
		for(i = 0; i < n; i++)
		{
			if(maxi < max[i])
			{
				maxiIndex = i;
				maxi = max[i];
			}
		}
		
		Stack<Integer> stack = new Stack<>();
		for(i = maxiIndex; i >= 0; i--)
		{
			if(max[i] == maxi)
			{
				stack.push(arr[i]);
				maxi--;
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + ", ");
		}
	}
}
