import java.util.Scanner;

public class TowerOfHanoi{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int numberOfDisks = sc.nextInt();
		Tower [] towers = new Tower[3];
		for (int i = 0; i < 3; i++){
			towers[i] = new Tower(i);
		}
		for (int i = numberOfDisks - 1; i >= 0;i--){
			towers[0].add(i);
		}
		System.out.println("All disks added to first tower");
		towers[0].moveDisks(numberOfDisks, towers[2], towers[1]);
		System.out.println("Disks on tower 3");
		System.out.println(towers[2].getDisks());
		System.out.println("Disks on tower 1");
		System.out.println(towers[0].getDisks());
	}
}