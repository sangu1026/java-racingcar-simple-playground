package step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step2.domain.randomNumGenerator;

import static org.assertj.core.api.Assertions.*;

public class carRaceTest {
    @Test
    @DisplayName("random 값은 0에서 9사이에 값이 반환된다")
    void randNumIsBetweenZeroAndNine(){
        int randomNum = randomNumGenerator.getRandomNum();

        assertThat(randomNum).isBetween(0,9);
    }

}
