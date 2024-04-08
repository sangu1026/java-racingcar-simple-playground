package step3.domain;

import java.util.Objects;

public class CarName {

    private final String name;

    public CarName(String name){
        isValidName(name);
        this.name=name;
    }

    private void isValidName(String name)throws IllegalArgumentException{
        isEmpty(name);
        isValidLength(name);
    }

    private void isEmpty(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름은 1글자 이상 5글자 이하로 지정하여야 합니다.");
        }
    }

    private void isValidLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 1글자 이상 5글자 이하로 지정하여야 합니다.");
        }
    }

    public String name() {
        return name;
    }
}
