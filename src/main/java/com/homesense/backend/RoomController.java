package com.homesense.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RoomController {

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        // Just return one room for now
        return List.of(
            new Room(1L, "Living Room")
        );
    }
}
