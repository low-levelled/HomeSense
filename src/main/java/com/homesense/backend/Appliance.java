package com.homesense.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private Long roomId;

    public Appliance() {
        // Default constructor for JPA
    }

    public Appliance(Long id, String name, String type, Long roomId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.roomId = roomId;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public Long getRoomId() { return roomId; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setRoomId(Long roomId) { this.roomId = roomId; }
}
