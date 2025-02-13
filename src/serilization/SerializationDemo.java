package serilization;

import java.io.Serializable;

public class SerializationDemo implements Serializable{
	
	int id;
	String name;
	public SerializationDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	

}
