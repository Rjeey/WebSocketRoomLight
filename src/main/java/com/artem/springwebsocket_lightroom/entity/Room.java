package com.artem.springwebsocket_lightroom.entity;


import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private Boolean light;
//    private Country country;

    public Room(int id, Boolean light) {
        this.light = light;
        this.id = id;
    }

    public Room() {
    }

    public int getRoomNumber() {
        return id;
    }

    public void setRoomNumber(int id) {
        this.id = id;
    }

    public Boolean getLight() {
        return light;
    }

    public void setLight(Boolean light) {
        this.light = light;
    }
}
