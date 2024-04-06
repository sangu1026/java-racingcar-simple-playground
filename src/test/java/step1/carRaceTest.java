package step1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class carRaceTest {
    @Test
    @DisplayName("random 값은 0에서 9사이에 값이 반환된다")
    void randNumIsBetweenZeroAndNine(){
        randomNumGenerator randomNumGenerator = new randomNumGenerator();
        int randNum= randomNumGenerator.getRandNum();

        assertThat(randNum).isBetween(0,9);
    }
}
