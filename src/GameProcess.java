public class GameProcess {
    int[] answer;
    int[] input;
    NumberGenerator n = new RandomNumberGenerator();

    GameProcess() {
        this.answer = n.numbers();
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setInput(int[] input) {
        this.input = input;
    }
}
