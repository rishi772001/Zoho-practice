
public class ReverseString {
	public static String reverse(String[] words, int i) {
		if(i == words.length - 1)
			return words[i];
		return reverse(words, i + 1) + " " + words[i] ;
	}
	public static void main(String[] args) {
		String str = "one two three";
		String[] words = str.split(" ");
		System.out.println(reverse(words, 0));
	}
}
