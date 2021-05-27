
public class SnakeMatrix {
	public static void main(String[] args) {
		int n = 4;
		
		int val = 1, i, j;
		int spaces = n - 1;
		
		
		i = 1;
		while(i <= n * n)
		{
			// spaces
			for(j = 0; j < spaces; j++)
			{
				System.out.print("  ");
			}
			spaces--;
			
			for(j = 0; j < n - 1; j++)
			{
				System.out.print(i + " ");
				i = i + val;
			}
			
			System.out.print(i + " ");
			i += n;
			val = val * -1;
			System.out.println();
		}
		
	}
}
