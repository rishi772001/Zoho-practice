
public class PrintDuplicates {
	public static void main(String[] args) {
		int arr[] = { 2,3,6,2,3,1,50 };
		int n = arr.length;
		
		// traverse the array
//		while( i < n)
//		{
//			// if element is less than or equals zero
//			// then it is count, so move to next element
//			if(arr[i] <= 0)
//			{
//				i++;
//				continue;
//			}
//			
//			// else find index of element
//			int index = arr[i] - 1;
//			if(arr[index] > 0)
//			{
//				arr[i] = arr[index];
//				arr[index] = -1;
//			}
//			else {
//				arr[index]--;
//				arr[i] = 0;
//				i++;
//			}
//		}
		
		System.out.println("Count of elements");
		for(int i = 0; i < n; i++) {
			int count = 0;
			int temp = arr[i];
			if(arr[i] != -1) 
			{
				for(int j = i + 1; j < n; j++)
				{
					if(arr[j] == arr[i]) 
					{
						count++;
						arr[j] = -1;
					}	
				}
				arr[i] = -1;
				System.out.println(temp + " - " + (count + 1));
			}
			
			
		}
		
	}
}
