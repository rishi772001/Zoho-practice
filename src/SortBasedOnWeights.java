import java.util.*;
import java.util.Map.Entry;

public class SortBasedOnWeights {
	static boolean isSquare(int a)
	{
		double val = Math.sqrt(a);
		int check = (int) val;
		if(val - check == 0) 
			return true;
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {10, 36, 54, 89, 12};
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		for(int i : arr)
		{
			if(!map.containsKey(i))
				map.put(i, 0);
			if(isSquare(i))
				map.put(i, map.get(i) + 5);
			if(i % 4 == 0 && i % 6 == 0)
				map.put(i, map.get(i) + 4);
			if((i & 1) == 0)
				map.put(i, map.get(i) + 3);
			
		}
		
		int weights[][] = new int[map.size()][2];
		int counter = 0;
		for(Entry<Integer, Integer> i :map.entrySet())
		{
			weights[counter][0] = i.getKey();
			weights[counter++][1] = i.getValue();
		}
		
		Arrays.sort(weights, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[1] > b[1]) return 1;
				else if(a[1] == b[1] && a[0] > b[0]) return 1;
				return -1;
			}
		});
		
		for(int i[] : weights)
		{
			System.out.print("<" + i[0] + "," +i[1] + ">,");
		}
	}
}
