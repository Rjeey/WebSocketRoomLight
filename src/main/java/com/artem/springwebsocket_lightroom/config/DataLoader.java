package com.artem.springwebsocket_lightroom.config;

import com.artem.springwebsocket_lightroom.entity.Room;
import com.artem.springwebsocket_lightroom.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private RoomRepository roomRepository;

//    @Autowired
    public DataLoader(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public void run(ApplicationArguments args) {
        roomRepository.save(new Room(1, true));
        roomRepository.save(new Room(2, false));
        roomRepository.save(new Room(3, false));
        roomRepository.save(new Room(4, true));
        roomRepository.save(new Room(5, true));
        roomRepository.save(new Room(6, true));
        roomRepository.save(new Room(7, false));
        roomRepository.save(new Room(8, false));
    }
}