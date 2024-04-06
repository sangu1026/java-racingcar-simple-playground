package step1;

public class randomNumGenerator {
    public int getRandNum() {
        double ran = Math.random();
        return (int) (ran * 10);
    }
}
