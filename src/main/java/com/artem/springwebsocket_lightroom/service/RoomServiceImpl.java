package com.artem.springwebsocket_lightroom.service;

import com.artem.springwebsocket_lightroom.entity.Room;
import com.artem.springwebsocket_lightroom.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

//    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).orElse(new Room());
    }

    @Override
    public void save(Room room) {
        roomRepository.save(room);
    }
}
