import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters{

	public static String longestSubstringWithKUniqueCharacters(String s, int k){
		int i = 0, j = 0;
		Map<Character,Integer> map = new HashMap<>();
		int max = -1;
		while (j < s.length()){
			char charAtJ = s.charAt(j);
			map.put(charAtJ, map.getOrDefault(charAtJ,0) + 1);
			if (map.size() == k){
				if (j-i+1 > max){
					max = j-i+1;
				}
			} else if (map.size() > k){
				while (map.size() > k){
					char charAtI = s.charAt(i);
					map.put(charAtI, map.get(charAtI)-1);
					if (map.get(charAtI) <= 0){
						map.remove(charAtI);
					}
					i++;
				}
			}
			j++;
		}
		return s.substring(i,i+max);
	}


	public static void main(String...ar){
		String s = "aabacbebebe";
		int k = 3;
		System.out.println(longestSubstringWithKUniqueCharacters(s,k));
	}

}