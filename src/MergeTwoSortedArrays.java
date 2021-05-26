
public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int arr1[] = {2,2,2,4,5,6,6,7,9,9,9,10,13,13,13};
		int arr2[] = {2,3,3,4,5,6,7,8,9,11,11,15,15};
		
		int out[] = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0,k = 0;
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				if(!(k != 0 && out[k - 1] == arr1[i])) out[k++] = arr1[i++];
				else i++;
			}
				
			else if(arr1[i] > arr2[j]) {
				if(!(k != 0 && out[k - 1] == arr2[j])) out[k++] = arr2[j++];
				else j++;
			}
				
			
			else {
				if(!(k != 0 && out[k - 1] == arr1[i])) out[k++] = arr1[i];
				i++; j++;
			}
		}
		
		while(i < arr1.length)
		{
			if(!(k != 0 && out[k - 1] == arr1[i])) out[k++] = arr1[i++];
			else i++;
		}
		
		while(j < arr2.length) {
			if(!(k != 0 && out[k - 1] == arr2[j])) out[k++] = arr2[j++];
			else j++;
		}
		
		for(int temp : out)
			if(temp != 0) System.out.print(temp + ", ");
	}
}
