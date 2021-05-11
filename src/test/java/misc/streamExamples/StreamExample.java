package misc.streamExamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> _listOfInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfNumbersGreaterThan5 = _listOfInt.stream().
                filter((i) -> i > 5)
                .mapToInt(i -> i).sum();
        System.out.println("Stream of addition numbers " + sumOfNumbersGreaterThan5);

        int sumOfAllNumbers = _listOfInt
                .stream().reduce(0, Integer::sum);

        System.out.println("Stream of int summing up " + sumOfAllNumbers);

        int sumOfAllNumbers2 = _listOfInt
                .stream().reduce(0, (a, b) -> a + b);

        System.out.println("Stream of int2 summing up " + sumOfAllNumbers2);

    }
}
