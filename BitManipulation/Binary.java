import java.util.Scanner;


//Understand how a negative integer is stored in the memory in Java.
public class Binary{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
	}
}