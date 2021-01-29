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
        executorService.execute(new Car("5", fuelStation));
        executorService.execute(new Car("6", fuelStation));
        executorService.execute(new Car("7", fuelStation));
        executorService.execute(new Car("8", fuelStation));
        executorService.execute(new Car("9", fuelStation));
        executorService.execute(new Car("10", fuelStation));

        executorService.shutdown();
    }
}
