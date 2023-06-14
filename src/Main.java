import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        InputView iv = new InputView();
        NumberGenerator n = new RandomNumberGenerator();
        int[] answer = n.numbers();
        System.out.println(Arrays.toString(answer));

        boolean gameFlag = false;
        while (!gameFlag) {

            int[] input = iv.userInput();
            System.out.println(Arrays.toString(input));
            if (Arrays.equals(answer, input)) {
                gameFlag = true;
            }
        }

        System.out.println("게임 종료");

    }
}