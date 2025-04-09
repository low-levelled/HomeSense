package com.homesense.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int quantity;
    private String unit;
    private String location;

    public InventoryItem() {
        // Default constructor for JPA
    }

    public InventoryItem(Long id, String name, int quantity, String unit, String location) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.location = location;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public String getUnit() { return unit; }
    public String getLocation() { return location; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setUnit(String unit) { this.unit = unit; }
    public void setLocation(String location) { this.location = location; }
}
