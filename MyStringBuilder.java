
public class MyStringBuilder{
	
	private static final int DEFAULT_SIZE=16;
	private static final int BUFFER_MULTIPLIER=2;
	
	private char[] string;
	private int size;
	private int charCount;

	// add default constructor
	public MyStringBuilder(){
		this.size= this.DEFAULT_SIZE;
		this.string = new char[DEFAULT_SIZE];
	}

	public MyStringBuilder(String newString){
		// we have done this to take of care of that the variable size should always be equal to the multiple of default size.
		//   in this manner we do not need to add new overloaded methods to take of the case when size== length of new string being passed to the constructor.
		this();
		append(newString);
	}

	public MyStringBuilder(char [] string){
		this();
		append(string);
	}

	public MyStringBuilder append(String newString){
		while (isResizeRequired(newString.length())){
			resizeBuffer(newString.length());
		}
		addString(newString);
		updateCharCount(newString.length());
		return this;
	}
	
	public MyStringBuilder append(char [] newString){
		while (isResizeRequired(newString.length)){
			resizeBuffer(newString.length);
		}
		addString(newString);
		updateCharCount(newString.length);
		return this;	
	}

	
	private void resizeBuffer(int newStringLength){
		int newSize = this.size * BUFFER_MULTIPLIER;
		this.size = newSize;
		char[] newCharArray = new char[newSize];
		for (int i = 0; i < this.string.length; i++){
			newCharArray[i] = this.string[i];
		}
		this.string = newCharArray;
		return;
	}

	private void addString(String newString){
		int currentPosition=this.charCount;
		for (int i = 0; i < newString.length(); i++){
			this.string[currentPosition] = newString.charAt(i);
			currentPosition+=1;
		}
	}

	private void addString(char [] newString){
		int currentPosition = this.charCount;
		for (int i = 0; i < newString.length; i++) {
			this.string[currentPosition] = newString[i];
			currentPosition+=1;
		}
	}

	private void updateCharCount(int charCount){
		this.charCount+=charCount;
	}

	private boolean isResizeRequired(int userSize){
		return (charCount + userSize) > this.size;
	}

	public String toString(){
		return new String(this.string);
	}


}


class Test{
	
	public static void main(String...ar){
		MyStringBuilder stringBuilder = new MyStringBuilder();
		stringBuilder.append("Dimple");
		stringBuilder.append("Gaurav");
		stringBuilder.append("Sarupria");
		stringBuilder.append("8thDecember2019UdaipurRajasthanIndia");
		System.out.println(stringBuilder.toString());
	}
}		

	