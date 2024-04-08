package step3;

import step3.controller.RacingCarController;
import step3.view.InputView;

public class RacingCarMain {
    public static void main(String[] args) {
        RacingCarController racingCarController=new RacingCarController();
        racingCarController.startRace();
        racingCarController.showWinner();
    }
}
