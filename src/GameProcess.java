import java.io.IOException;

public class GameProcess {
    int[] answer;
    int[] input;
    NumberGenerator n = new RandomNumberGenerator();
    InputView iv = new InputView();

    GameProcess() {
        this.answer = n.numbers();
    }


    public int[] getAnswer() {
        return answer;
    }

    public void setInput() throws IOException {
        this.input = iv.userInput();
    }

    public int getStrike() {
        int strike = 0;
        for (int i = 0; i<4; i++) {
            if (answer[i] == input[i]) {
                strike++;
            }
        }
        return strike;
    }

    public int getBall() {
        int ball = 0;
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                if (i != j && answer[i] == input[j]) {
                    ball++;
                }
            }
        }
        return ball;
    }
}
