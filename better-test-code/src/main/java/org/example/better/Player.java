package org.example.better;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private Map<ResourceType, Integer> resources;

    public Player(String name, Map<ResourceType, Integer> resources) {
        this.name = name;
        this.resources = new HashMap<>(resources);
    }

    public String getName() {
        return this.name;
    }

    public Map<ResourceType, Integer> getResources() {
        return new HashMap<>(this.resources);
    }

    // ... constructors, getters, setters, etc.

    public boolean hasEnoughResourcesForSettlement() {
        // TODO implement
        return false;
    }

    public void applyTrade(Trade trade) {
        // Apply the trade to the player's resources
        // ...
    }

    public void undoTrade(Trade trade) {
        // Undo the trade (for testing purposes)
        // ...
    }

    public boolean canBuildSettlement() {
        // TODO implement
        return false;
    }
}