package in.org.rebit.infrabooking.service;

import java.util.List;

import in.org.rebit.infrabooking.entity.Room;

public interface RoomService {
	
	public Room createRoom(Room r);
	public List<Room> getAllRoom();
	public Room getRoomById(Room r);

}
