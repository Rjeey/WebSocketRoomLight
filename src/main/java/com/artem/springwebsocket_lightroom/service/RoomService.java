package com.artem.springwebsocket_lightroom.service;

import com.artem.springwebsocket_lightroom.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    Room getRoomById(Integer id);

    void save(Room room);
}
