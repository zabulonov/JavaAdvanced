package org.example;
import java.util.UUID;

public class Sweet {

    private UUID id;
    private String name;
    private float weight;
    private float cost;

    public Sweet(String name, float weight, float cost) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getCost() {
        return cost;
    }
}
