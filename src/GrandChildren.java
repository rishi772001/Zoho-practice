import java.util.*;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TreeNode
{
	String name;
	ArrayList<TreeNode> children = new ArrayList<>();
	TreeNode(String name)
	{
		this.name = name;
	}
	public void addChild(TreeNode child)
	{
		this.children.add(child);
	}
}

public class GrandChildren {
	public static void main(String[] args) {
		// child, parent
		String arr[][] = {
				{"luke", "shaw"},
				{"wayne", "rooney"},
				{"rooney", "ronaldo"},
				{"rishi", "rooney"},
				{"shaw", "ronaldo"},
			};
		
		String name = "ronaldo";
		HashMap<String, TreeNode> map = new HashMap<>();
		
		for(String i[] : arr)
		{
			if(!map.containsKey(i[1]))
				map.put(i[1], new TreeNode(i[1]));
			if(!map.containsKey(i[0]))
				map.put(i[0], new TreeNode(i[0]));
				
			map.get(i[1]).addChild(map.get(i[0]));
		}
		
		Deque<TreeNode> q = new ArrayDeque<>();
		
		q.add(map.get(name));
		
		int level = 0;
		
		while(!q.isEmpty() || level < 2)
		{
			int length = q.size();
			level++;
			while(length-- > 0)
			{
				for(TreeNode node : q.remove().children)
				{
					q.add(node);
					if(level == 2) System.out.println(node.name);
				}
			}
		}
		
	}
}

