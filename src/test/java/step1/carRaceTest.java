package step1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class carRaceTest {
    @Test
    @DisplayName("random 값은 0에서 9사이에 값이 반환된다")
    void randNumIsBetweenZeroAndNine(){
        randomNumGenerator randomNumGenerator = new randomNumGenerator();
        int randNum= randomNumGenerator.getRandNum();

        assertThat(randNum).isBetween(0,9);
    }
    @ParameterizedTest
    @ValueSource(ints={4,9})
    @DisplayName("random 값이 4 이상일 경우 전진")
    void carMoveForward(int randomNum){
        //given
        Car car = new Car(0);
        int current_location = car.getCurrent_location();

        //when
        int next_location=car.check_randNum(randomNum,car);

        //then
        Assertions.assertThat(next_location).isEqualTo(current_location + 1);

    }
}
