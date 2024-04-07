package step2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import step2.controller.RacingGame;
import step2.domain.Car;
import step2.domain.Winners;
import step2.domain.randomNumGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class carRaceTest {
    @Test
    @DisplayName("random 값은 0에서 9사이에 값이 반환된다")
    void randNumIsBetweenZeroAndNine(){
        int randomNum = randomNumGenerator.getRandomNum();

        assertThat(randomNum).isBetween(0,9);
    }

    @ParameterizedTest
    @DisplayName("한명의 우승:정해진 대본으로 test시 brown의 우승")
    @CsvSource({"'neo,brie,brown',5"})
    public void raceCarTest1(String name,int tryNum){
        RacingGame racingGame= new RacingGame(name,tryNum);

        int[][] script={{1,1,9},{1,1,9},{1,1,9},{1,1,9},{1,1,9}};
        int cnt=0;
        while(racingGame.racing()){
            racingGame.testRace(script[cnt++]);
        }
        List<Car> winners = Winners.findWinners(racingGame.getCars());

        List<String> winnersName = new ArrayList<>();
        for(Car winner: winners){
            winnersName.add(winner.getName());
        }

        Assertions.assertThat(winnersName).contains("brown");
    }


}
