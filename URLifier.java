import java.util.Scanner;

public class URLifier{
	
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int trueLength = sc.nextInt();
		char [] urlifiedString = replaceSpaces(input.toCharArray(), trueLength);
		System.out.println(new String(urlifiedString));
	}

	public static char [] replaceSpaces(char [] str, int trueLength){
		int spaceCount = 0, index, i = 0;
		for (i=0; i < trueLength; i++){
			if (str[i] == ' '){
				spaceCount++;
			}
		}
		
		index = trueLength + spaceCount * 2;
		
		for ( i = trueLength - 1; i >=0;i--){
			if (str[i] == ' '){
				str[index-1]='0';
				str[index-2]='2';
				str[index-3]='%';
				index = index - 3;
			}
			else {
				str[index-1] = str[i];
				index--;
			}
		}
		return str;
	}

}