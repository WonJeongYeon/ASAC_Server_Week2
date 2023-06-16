public class OutputView {
    private static final String ERROR_MESSAGE = "Error: ";
    private static final String RETRY_MESSAGE = " 다시 시도해 주세요.";

    public void inputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void inValidInputMessage() {
        println("숫자만 입력하실 수 있습니다.", true);
    }

    public void inValidSizeMessage() {
        println("숫자는 4개만 입력하실 수 있습니다.", true);
    }

    public void inValidNumberMessage() {
        println("서로 다른 4개의 숫자만 입력하실 수 있습니다.", true);
    }

    public void gamePlayMessage(int strike, int ball) {
        if (strike + ball == 0) {
            println("Nothing", false);
        } else if (strike == 0){
            println(ball + "볼", false);
        } else if (ball == 0) {
            println(strike + "스트라이크", false);
        } else {
            println(strike + "스트라이크 " + ball + "볼", false);
        }
    }

    public static void println(String message, boolean isRetry) {
        if (isRetry) {
            System.out.println(ERROR_MESSAGE + message + RETRY_MESSAGE);
        } else {
            System.out.println(message);
        }

    }
}
