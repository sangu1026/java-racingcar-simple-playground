package step3.controller;

import step3.domain.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private int tryNo;

    public RacingGame(String carNames, int tryNo) {
        this.cars = initCars(carNames);
        this.tryNo = tryNo;
    }

    private static List<Car> initCars(String carNames) {

        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void race() {
        this.tryNo--;
        moveCars();
    }


    private void moveCars() {
        for (Car car : cars) {
            car.forwardCar(RandomNumGenerator.getRandomNum());
        }
    }

    public boolean racing() {
        return this.tryNo > 0;
    }

    public List<Car> getCars() {
        Collections.unmodifiableList(cars);
        return cars;
    }

    public List<Car> getWinners() {
        return null;
    }
}
