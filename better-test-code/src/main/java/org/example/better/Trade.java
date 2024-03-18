package org.example.better;

public class Trade {
    private ResourceType fromResource;
    private ResourceType toResource;

    public Trade(ResourceType fromResource, ResourceType toResource) {
        this.fromResource = fromResource;
        this.toResource = toResource;
    }

    public ResourceType getFromResource() {
        return this.fromResource;
    }

    public ResourceType getToResource() {
        return this.toResource;
    }
}
