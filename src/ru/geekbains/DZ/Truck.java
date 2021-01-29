package ru.geekbains.DZ;

public class Truck extends Vehicle implements Runnable{
    private String name;
    private static int capacity = 60;
    private static float consumption =15;
    public static FuelStation fuelStation;


    public Truck(String name, FuelStation fuelStation) {
        this.name = "Truck" + name;
        this.fuelStation = fuelStation;
    }

    @Override
    public void run() {
        try {
            while (true) {
                float fuelLeft = capacity;
                while(fuelLeft >= consumption*3) {
                    Thread.sleep(3000);
                    fuelLeft = fuelLeft - consumption*3;
                    System.out.println(String.format("%s has %s fuel left", name, fuelLeft));
                }
                fuelStation.enter(name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
