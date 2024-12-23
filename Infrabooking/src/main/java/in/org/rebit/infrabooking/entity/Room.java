package in.org.rebit.infrabooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int capacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Room(int capacity) {
		super();
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", capacity=" + capacity +  "]";
	}
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
}
