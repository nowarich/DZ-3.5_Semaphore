package ru.geekbains.DZ;

public class Car extends Vehicle implements Runnable {
    private String name;
    private static int capacity = 20;
    private static float consumption = 2.5f;
    public static FuelStation fuelStation;

//    @Override
//    public String getName() {
//        return name;
//    }

    public Car(String name, FuelStation fuelStation) {
        this.name = "Car " + name;
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
