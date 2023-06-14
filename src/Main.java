import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        InputView iv = new InputView();
        GameProcess game = new GameProcess();
        int[] answer = game.getAnswer();
        System.out.println(Arrays.toString(answer));

        boolean gameFlag = false;
        while (!gameFlag) {

            int[] input = iv.userInput();
            game.setInput(input);
            System.out.println(Arrays.toString(input));
            if (Arrays.equals(answer, input)) {
                gameFlag = true;
            }
        }

        System.out.println("게임 종료");

    }
}