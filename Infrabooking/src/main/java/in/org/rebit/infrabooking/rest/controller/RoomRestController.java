package in.org.rebit.infrabooking.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.org.rebit.infrabooking.entity.Room;
import in.org.rebit.infrabooking.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomRestController {
	
	@Autowired
	RoomService service;

	@PostMapping
	public ResponseEntity<Room> createRoom(@RequestBody Room r){
		 Room room = this.service.createRoom(r);
		 ResponseEntity<Room> entity = new ResponseEntity<>(room, HttpStatus.CREATED);
		 return entity;
	}
	
	
	@GetMapping
	public List<Room> getAllRoom(){
		return this.service.getAllRoom();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Room> getRoomById(@PathVariable int id, @RequestBody Room r){
		r.setId(id);
		Room roomById = this.service.getRoomById(r);
		ResponseEntity<Room> entity =  new ResponseEntity<>(roomById, HttpStatus.OK);
		return entity;
	}
	
}
