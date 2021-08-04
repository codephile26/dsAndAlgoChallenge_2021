import java.util.*;

class Solution {

	public List<String> permuteWithSpaces(String input){
		List<String> permutations = new ArrayList<>();
		String output = new String("" + input.charAt(0));
		permuteWithSpacesHelper(output,input.substring(1),permutations);
		return permutations;
	}
	
	private void permuteWithSpacesHelper(String output, String input, List<String> permutations){
		if (input.length() == 0){
		   permutations.add(output);
		   return;
		}
		
		String output2 = output + input.charAt(0);
		String output1 = output + "_" + input.charAt(0);
		permuteWithSpacesHelper(output1,input.substring(1),permutations);
		permuteWithSpacesHelper(output2,input.substring(1),permutations);
	}
}

public class PermutationsWithSpaces {
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Solution solution = new Solution();
		List<String> permuteWithSpaces = solution.permuteWithSpaces(input);
		System.out.println(permuteWithSpaces);
	}
}