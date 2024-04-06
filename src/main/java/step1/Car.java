package step1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Car {
    private static int next_car_num=1;

    private int car_num;
    private int current_location;

    public Car(int current_location) {
        this.car_num = next_car_num++;
        this.current_location = current_location;
    }
    public int getCar_num() {
        return car_num;
    }
    public int getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(int current_location) {
        this.current_location = current_location;
    }
}