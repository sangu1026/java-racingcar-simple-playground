package step2.domain;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Car {
    private static final int FORWARD_NUM = 4;

    private final String name;
    private int position =0;
    public Car(String name) {
        this.name = name.trim();
    }

    public Car(String name, int position) {
        this.name = name.trim();
        this.position = position;
    }

    public void forwardCar(int randomNum) {
        if (randomNum >= FORWARD_NUM)
            this.position++;
    }

    public boolean isWinner(int maxPosition) {
        return this.position == maxPosition;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}