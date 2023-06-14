import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {


    @Override
    public int[] numbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        int num;
        while (numbers.size() < 4) {
            num = random.nextInt(10);
            numbers.add(num);
        }
        return Arrays.stream(numbers.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }
}
