package step3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import step3.domain.RacingGame;
import step3.domain.Car;
import step3.domain.Winners;
import step3.utils.RandomNumGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class carRaceTest {
    @Test
    @DisplayName("random 값은 0에서 9사이에 값이 반환된다")
    void randNumIsBetweenZeroAndNine(){
        int randomNum = RandomNumGenerator.getRandomNum();

        assertThat(randomNum).isBetween(0,9);
    }


}
