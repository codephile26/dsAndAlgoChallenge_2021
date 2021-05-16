import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams{

	public static void groupAnagrams(String [] strings){
		HashMap<String, ArrayList<String>> mapList = new HashMap<>();

		for (String element : strings){
			String sorted = sortChars(element);
			if (!mapList.containsKey(sorted)){
				mapList.put(sorted, new ArrayList<String>());
			}
			mapList.get(sorted).add(element);
		}

		//add all the strings back to the same array
		int index = 0;
		for (String key : mapList.keySet()){
			ArrayList<String> anagrams = mapList.get(key);
			for (String word: anagrams){
				strings[index] = word;
				index++;
			}		
		}
	}

	private static String sortChars(String s){
		char [] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static void main(String [] ar){
		String [] words = {"acre", "spoon", "diary", "care", "cup", "race", "dairy"};
		groupAnagrams(words);
		for (String  string : words){
			System.out.print(string + " ");
		}
	}
}