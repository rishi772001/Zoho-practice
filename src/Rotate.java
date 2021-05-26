import java.util.Arrays;

public class Rotate {
	static int findEnd(int n) {
		int val = 1;
		for(int i = 1; i < n; i++)
		{
			val += i + 1;
		}
		return val;
	}
	public static void main(String[] args) {
		int n = 10;
		
		int matrix[][] = new int[n][n];
		
		int counter = 1, end = findEnd(n), flag = 0, i = 0, j = 0;
		
		// flag 0 : diagonal; flag 1 : top; flag 2: left
		try {
		while(counter <= end) {
			if(flag == 0) {
				if(j >= n) {
					flag = 1;
					i-= 2;j--;
				}
				else if(matrix[i][j] != 0)
				{
					flag = 1;
					i-= 2;j--;
				}
				else
					matrix[i++][j++] = counter++; 
			}
			
			else if(flag == 1) {
				if(i < 0)
				{
					flag = 2;
					i++;j--;
				}
				
				else if(matrix[i][j] != 0)
				{
					flag = 2;
					i++;j--;
				}
				else
					matrix[i--][j] = counter++; 
			}
			else if(flag == 2) {
				if(matrix[i][j] != 0) {
					flag = 0;
					i++; j+=2;
				}
				else
					matrix[i][j--] = counter++; 
			}
		}
		}
		catch (Exception e) {
			System.out.println(i +"" + j);
		}
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				if(matrix[i][j] == 0)
				{
					int temp = end;
					while(temp % 10 != 0)
					{
						temp = temp / 10;
						System.out.print(" ");
					}
				}
				
				else
					System.out.print(matrix[i][j]);
				
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
