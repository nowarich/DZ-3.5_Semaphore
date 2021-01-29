package ru.geekbains.DZ;

import java.util.concurrent.Semaphore;

public class FuelStation {
    private Semaphore semaphore;

    public FuelStation() {
        this(3);
    }

    public FuelStation(int permits) {
        semaphore = new Semaphore(permits);
    }

    public void enter(String name) {
//        String name = vehicle.getName();
        System.out.println("A vehicle " + name + " is entering the Fuel Station...");
        try {
            semaphore.acquire();
            System.out.println(name + " entered.");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException("Semaphore couldn't be acquired", e);
        } finally {
            semaphore.release();
            System.out.println("Fuel Station has been released by " + name);
        }
    }
}
