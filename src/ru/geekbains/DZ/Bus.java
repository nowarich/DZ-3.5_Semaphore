package ru.geekbains.DZ;

public class Bus extends Vehicle implements Runnable{
    private String name;
    private static int capacity = 40;
    private static float consumption =7.5f;
    public static FuelStation fuelStation;


    public Bus(String name, FuelStation fuelStation) {
        this.name = "Bus" + name;
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
