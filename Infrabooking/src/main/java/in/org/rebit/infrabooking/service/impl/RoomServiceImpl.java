package in.org.rebit.infrabooking.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.org.rebit.infrabooking.dao.RoomDao;
import in.org.rebit.infrabooking.entity.Room;
import in.org.rebit.infrabooking.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomDao dao;

	@Override
	public Room createRoom(Room r) {
		return this.dao.save(r);
	}

	@Override
	public List<Room> getAllRoom() {
		
		return this.dao.findAll();
	}

	
	@Override
	public Room getRoomById(Room r) {
		Optional<Room> byId = this.dao.findById(r.getId());
		Room room = byId.get();
		room.setCapacity(r.getCapacity());
		this.dao.save(room);
		return room;
		
	}

}
