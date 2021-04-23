import java.util.LinkedList;

public class AnimalQueue{

	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();

	public void enqueue(Animal a){
		if (a instanceof Dog){
			dogs.add((Dog)a);
		}
		else {
			cats.add((Cat)a);
		}
	}

	public Animal dequeueAny(){
		if (dogs.size() == 0){
			return cats.poll();
		}
		else if (cats.size() == 0){
			return dogs.poll();
		}

		int compare = dogs.peek().getTimestamp().compareTo(cats.peek().getTimestamp());
		if (compare >= 0){
			return dequeueDogs();
		} else {
			return dequeueCats();
		}
	}

	public Dog dequeueDogs(){
		return dogs.poll();
	}

	public Cat dequeueCats(){
		return cats.poll();
	}

}
