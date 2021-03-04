
public class ReverseString {

	public static String reverseString(String s ) {
		return reverse(s, 1, "");
	}
	private static String reverse(String s,int i, String reverse ) {
		if(s.length()==reverse.length()) {
			return reverse;
		}
		reverse+=s.charAt(s.length()-i);
		i++;
		return reverse(s,i,reverse);
	}
	
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(ReverseString.reverseString(s));
	}

}
