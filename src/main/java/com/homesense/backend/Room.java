package com.homesense.backend;

// A basic Room object with an ID and name
public class Room {
    private Long id;
    private String name;

    public Room(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters — optional, but good for future updates or deserialization
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
