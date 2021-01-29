package ru.geekbains.DZ;

public class Bus extends Vehicle {
    private String name;
    private int capacity;
    private float consumption;

    public Bus() {
        this(40, 7.5f);
    }

    public Bus(int capacity, float consumption) {
        this.name = name;
        this.capacity = capacity;
        this.consumption = consumption;
    }
}
