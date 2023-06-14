import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        InputView iv = new InputView();
        OutputView ov = new OutputView();
        GameProcess game = new GameProcess();
        int[] answer = game.getAnswer();
        System.out.println(Arrays.toString(answer));

        boolean gameFlag = false;
        int strike, ball;
        while (!gameFlag) {

            int[] input = iv.userInput();
            game.setInput(input);
            System.out.println(Arrays.toString(input));
            strike = game.getStrike();
            ball = game.getBall();
            if (strike == 4) {
                gameFlag = true;
            }
            ov.gamePlayMessage(strike, ball);
        }

        System.out.println("게임 종료");

    }
}