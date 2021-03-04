import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Sort {

	public static void main(String[] args) {
		String s = "asyuiseyuijnhhssklloophaaqqaaaa";
		String sortedStr="";
	
		HashMap<Character, Integer> map = new HashMap<>();
		for(int  i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}	
	Stream<Entry<Character, Integer>> sorted=map.entrySet().stream().sorted(Map.Entry.comparingByValue());
	Iterator<Entry<Character, Integer>> itr=sorted.iterator();
	while(itr.hasNext()) {
		sortedStr+=itr.next().getKey();
	}
	System.out.println(sortedStr);
	}

}
