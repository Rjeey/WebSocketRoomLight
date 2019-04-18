package com.artem.springwebsocket_lightroom.service;

import com.artem.springwebsocket_lightroom.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    Room getRoomById(Integer id);

    void save(Room room);

    void delete(Integer id);

    void turnLightOn(Integer id);

    void turnLightOff(Integer id);

}
