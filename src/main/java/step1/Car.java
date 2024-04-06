package step1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Car {
    private static int next_car_num=1;
    private int car_num;
    private int location;


    public Car(){}
    public Car(int current_location) {
        this.car_num = next_car_num++;
        this.location = current_location;
    }

    public int getCar_num() {
        return car_num;
    }

    public int getCurrent_location() {
        return location;
    }

    public void setCurrent_location(int current_location) {
        this.location = current_location;
    }


    public int check_randNum(int num,Car car){
        if(num>=4){
            return forwardCar(car);
        }
        return stopCar(car);
    }


    public int forwardCar(Car car) {
        car.setCurrent_location(car.getCurrent_location()+1);
        return location;
    }

    public int stopCar(Car car) {
        return location;
    }
}