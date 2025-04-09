package com.homesense.backend;

import com.homesense.backend.repository.ApplianceRepository;
import com.homesense.backend.repository.InventoryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryItemRepository inventoryRepo;

    @Autowired
    private ApplianceRepository applianceRepo;

    // Get all items stored in a specific location (e.g., "fridge")
    @GetMapping("/location/{location}")
    public List<InventoryItem> getByLocation(@PathVariable String location) {
        return inventoryRepo.findByLocation(location.toLowerCase());
    }

    // Add a new inventory item (for testing)
    @PostMapping("/add")
    public InventoryItem addItem(@RequestBody InventoryItem item) {
        return inventoryRepo.save(item);
    }

    // Get all appliances (e.g., Fridge, Pantry, etc.)
    @GetMapping("/appliances")
    public List<Appliance> getAllAppliances() {
        return applianceRepo.findAll();
    }

    // Add a new appliance (e.g., the Fridge in the Kitchen)
    @PostMapping("/appliances/add")
    public Appliance addAppliance(@RequestBody Appliance appliance) {
        return applianceRepo.save(appliance);
    }
}
