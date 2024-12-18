package in.org.rebit.infrabooking.service.impl;

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

}
