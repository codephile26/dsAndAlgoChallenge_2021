import java.util.Date;

public abstract class Animal {
	private Date timestamp;
	private String name;
	
	public String getName(){
		return this.name;
	}

	public Date getTimestamp(){
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp){
		this.timestamp = timestamp;
	}

	public Animal(String name, Date timestamp){
		this.name = name;
		this.timestamp = timestamp;
	}
}