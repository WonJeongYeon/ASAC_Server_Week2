import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputView {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    OutputView ov = new OutputView();

    public int[] userInput() throws IOException {
        ov.inputMessage();
        String input = br.readLine();
        int[] numbers = checkNumberFormat(input);
        if (checkNumberSize(numbers)) {
            return numbers;
        } else {
            ov.inValidSizeMessage();
            return userInput();
        }
    }

    private int[] checkNumberFormat(String input) throws IOException {
        int[] numbers;
        try {
            numbers = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        } catch (NumberFormatException e) {
            ov.inValidInputMessage();
            numbers = userInput();
        }
        return numbers;
    }

    private boolean checkNumberSize(int[] numbers) {
        return numbers.length == 4;
    }




}
