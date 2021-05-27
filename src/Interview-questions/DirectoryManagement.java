import java.util.*;

class Directory {
	private String name = "";
	private Directory prev = null;
	private ArrayList<Directory> directories= new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void setPrev(Directory prev)
	{
		this.prev = prev;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Directory getPrev() {
		return this.prev;
	}
	public boolean addDirectory(String name)
	{
		Directory newDir = new Directory(name);
		newDir.setPrev(this);
		directories.add(newDir);
		return true;
	}
	
	public void listDir()
	{
		for(Directory dir : directories)
		{
			System.out.println(dir.getName());
		}
	}
	
	public Directory isDirPresent(String name) throws Exception
	{
		for(Directory dir : directories)
		{
			if(dir.getName().equals(name)) {
				return dir;
			}
		}
		throw new Exception("No such directory" + name);
	}
	
	public Directory change(String[] path) throws Exception{
		Directory changeDir = this;
		for(String dir: path)
		{
			if(dir.equals(".")) continue;
			changeDir = changeDir.isDirPresent(dir);
		}
		return changeDir;
	}
	
	
}
public class DirectoryManagement {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start, press 0 to exit");
		
		Directory root = new Directory("~");
		Directory currDir = root;
		
		while(true)
		{
			String inp = sc.nextLine();
			String arr[] = inp.split(" ");
			
			if(inp.equals("0")) {
				System.out.println("Thank you");
				break;
			}
				
			
			if(arr[0].equals("md"))
			{
				currDir.addDirectory(arr[1]);
			}
			
			else if(arr[0].equals("cd"))
			{
				if(arr[1].charAt(0) != '~' && arr[1].charAt(0) != '.') {
					Directory changeDir = currDir.isDirPresent(arr[1]);
					currDir = changeDir;
				}
				
				else if(arr[1].charAt(0) == '.')
				{
					String[] dirs = arr[1].split("/");
					currDir = currDir.change(dirs);
				}
				
				else if(arr[1].charAt(0) == '~')
				{
					Directory temp = root;
					String[] dirs = arr[1].split("/");
					
					for(String dir : dirs)
					{
						if(dir.equals("~")) continue;
						currDir = temp.isDirPresent(dir);
						temp = currDir;
					}
				}
			}
			else if(arr[0].equals("cd.."))
			{
				currDir = currDir.getPrev()!= null ? currDir.getPrev() : currDir;
			}
			
			else if(arr[0].equals("ls"))
			{
				currDir.listDir();
			}
			
			else if(arr[0].equals("pwd"))
			{
				String out = currDir.getName();
				Directory temp = currDir;
				while(temp.getPrev() != null)
				{
					out += "/" + temp.getPrev().getName();
					temp = temp.getPrev();
				}
				System.out.println(new StringBuilder(out).reverse());
			}
		}
	}
}
