public class OutputView {
    private final String ERROR_MESSAGE = "Error: ";
    private final String RETRY_MESSAGE = " 다시 시도해 주세요.";

    public void inputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void inValidInputMessage() {
        System.out.println(ERROR_MESSAGE + "숫자만 입력하실 수 있습니다." + RETRY_MESSAGE);
    }

    public void inValidSizeMessage() {
        System.out.println(ERROR_MESSAGE + "숫자는 4개만 입력하실 수 있습니다." + RETRY_MESSAGE);
    }
}
