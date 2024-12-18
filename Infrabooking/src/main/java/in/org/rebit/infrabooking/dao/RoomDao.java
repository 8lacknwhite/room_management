package in.org.rebit.infrabooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.org.rebit.infrabooking.entity.Room;

public interface RoomDao extends JpaRepository<Room, Integer> {

}
