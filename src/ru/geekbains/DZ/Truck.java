package ru.geekbains.DZ;

public class Truck extends Vehicle {
    private String name;
    private int capacity;
    private float consumption;

    public Truck() {
        this(60, 15);
    }

    public Truck(int capacity, float consumption) {
        this.name = name;
        this.capacity = capacity;
        this.consumption = consumption;
    }
}
