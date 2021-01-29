package ru.geekbains.DZ;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        doFuelStationDemo();

    }

    static void doFuelStationDemo() {
        FuelStation fuelStation = new FuelStation();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(fuelStation::enter);
//        executorService.execute(fuelStation::enter);
//        executorService.execute(fuelStation::enter);
//        executorService.execute(fuelStation::enter);

        executorService.execute(new Car("1", fuelStation));
        executorService.execute(new Car("2", fuelStation));
        executorService.execute(new Car("3", fuelStation));
        executorService.execute(new Car("4", fuelStation));
        executorService.execute(new Truck("5", fuelStation));
        executorService.execute(new Truck("6", fuelStation));
        executorService.execute(new Truck("7", fuelStation));
        executorService.execute(new Bus("8", fuelStation));
        executorService.execute(new Bus("9", fuelStation));
        executorService.execute(new Bus("10", fuelStation));

        executorService.shutdown();
    }
}
