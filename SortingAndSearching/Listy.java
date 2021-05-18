public class Listy{

	private int [] list;


	public Listy(int [] array){
		list = array;
	}

	public int elementAt(int index){
		if (index < 0 || index >= list.length){
			return -1;
		}

		return list[index];
	}
}