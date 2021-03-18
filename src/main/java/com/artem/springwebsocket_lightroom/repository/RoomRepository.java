package com.artem.springwebsocket_lightroom.repository;

import com.artem.springwebsocket_lightroom.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

}