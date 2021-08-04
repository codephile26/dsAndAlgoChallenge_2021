import java.util.*;

public class PermutationWithCaseChange{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Solution solution = new Solution();
		List<String> permutationWithCaseChange = solution.permutationWithCaseChange(input);
		System.out.println(permutationWithCaseChange);
	}
}

class Solution {

	public List<String> permutationWithCaseChange(String input){
		List<String> permutations = new ArrayList<>();
		permuteHelper(permutations, input, "");
		return permutations;
	}


	private void permuteHelper(List<String> permutations, String input, String output){
		if (input.length() == 0){
			permutations.add(output);
			return;
		}

		String output1 = output + Character.toUpperCase(input.charAt(0));
		String output2 = output + input.charAt(0);
		permuteHelper(permutations,input.substring(1),output1);
		permuteHelper(permutations,input.substring(1),output2);
	}
}