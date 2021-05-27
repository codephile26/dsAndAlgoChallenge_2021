import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/*
* Class has methods to generate permutations of a String
* having duplicate characters.
*/
public class StringPermutationsDups{

	public static ArrayList<String> getPerms(String string){
		ArrayList<String> result = new ArrayList<String>();
		HashMap<Character,Integer> map = buildFrequencyTable(string);
		printPerms(map, "", string.length(), result);
		return result;
	}

	public static HashMap<Character,Integer> buildFrequencyTable(String string){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			if (map.containsKey(c)){
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public static void printPerms(HashMap<Character,Integer> map, String prefix, int remaining, ArrayList<String> result){
		if (remaining == 0){
			result.add(prefix);
			return;
		}

		for (Character c : map.keySet()){
			int count = map.get(c);
			if (count > 0){
				map.put(c, count - 1);
				printPerms(map, prefix + c, remaining - 1, result);
				map.put(c, count);
			}
		}
	}

	public static void main(String[] args){
		System.out.println(getPerms("aab"));
	}

}