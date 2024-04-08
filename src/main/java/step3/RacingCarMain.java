package step3;

import step3.controller.RacingCarController;
import step3.view.InputView;
import step3.view.OutputView;

public class RacingCarMain {
    public static void main(String[] args) {
        final String carNames=InputView.getCarNames();
        final int tryNo=InputView.getRaceCount();

        RacingCarController racingCarController=new RacingCarController(carNames,tryNo);
        racingCarController.startRace();

        OutputView.printRaceWinner(racingCarController.getWinners());
    }
}
