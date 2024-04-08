package step3.controller;

import step3.domain.Car;
import step3.domain.RacingGame;
import step3.domain.Winners;
import step3.view.InputView;
import step3.view.OutputView;

import java.util.List;

public class RacingCarController {

    private final RacingGame racingGame;


    public RacingCarController(String carNames,int tryNo){
        this.racingGame = new RacingGame(carNames, tryNo);
    }

    public void startRace(){
        OutputView.printRaceStartMessage();
        processRace();
    }


    private void processRace(){
        while(racingGame.racing()){
            racingGame.race();
            showRaceScore(racingGame.getCars());
        }
    }

    private  void showRaceScore(List<Car> cars){
        OutputView.printRaceScore(cars);
    }

    public List<String> getWinners(){
        return Winners.findWinners(racingGame.getCars());
    }
}
