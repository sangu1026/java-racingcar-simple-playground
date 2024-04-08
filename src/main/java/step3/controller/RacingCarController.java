package step3.controller;

import step3.domain.Car;
import step3.domain.RacingGame;
import step3.domain.Winners;
import step3.view.InputView;
import step3.view.OutputView;

import java.util.List;

public class RacingCarController {

    private final RacingGame racingGame;


    public RacingCarController(){
        String carNames=InputView.getCarNames();
        int tryNo=InputView.getRaceCount();
        this.racingGame = new RacingGame(carNames, tryNo);
    }

    public void startRace(){
        OutputView.printRaceStartMessage();
        processRace();
    }

    public void showWinner(){
        List<String> winners = Winners.findWinners(racingGame.getCars());
        OutputView.printRaceWinner(winners);
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


}
