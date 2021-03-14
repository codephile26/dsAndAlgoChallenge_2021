import java.util.List;
import java.util.ArrayList;

public class MyStringBuilder{
	
	private List<String> stringBuilder = new ArrayList<>();
	
	public List<String> getStringBuilder(){
		return stringBuilder;
	}
	
	// I don't think setter is needed because we dont want to accidentally set a blank list of strings in the member field of this object.

	public MyStringBuilder append(String string) {
		this.stringBuilder.add(string);
		return this;
	}
	
	public String toString(){
		String concatenatedString = "";
		for (String string:stringBuilder){	
			concatenatedString += string;
		}
		return concatenatedString;
	}
}

class Test{
	
	public static void main(String...ar){
		MyStringBuilder stringBuilder = new MyStringBuilder();
		stringBuilder.append("Dimple");
		stringBuilder.append("Gaurav");
		stringBuilder.append("Sarupria");
		System.out.println(stringBuilder.toString());
	}
}		

	