package com.artem.springwebsocket_lightroom.controller;


import com.artem.springwebsocket_lightroom.entity.Room;
import com.artem.springwebsocket_lightroom.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }


    @GetMapping("/api/rooms")
    public List<Room> getAllRooms() {
        List<Room> roomList = roomService.findAll();

        return roomList;
    }

    @GetMapping("/api/rooms/{roomNumber}")
    public Room getRoomById(@PathVariable Integer roomNumber) {
        return roomService.getRoomById(roomNumber);
    }

    @PutMapping("/api/rooms")
    public List<Room> setLight(@RequestBody Room room) {
        roomService.save(room);
        return roomService.findAll();
    }


    @MessageMapping("/rooms")
    @SendTo("/topic/messages")
    public Room send(Room room) throws Exception {

        roomService.save(room);
        return room;
    }

}
