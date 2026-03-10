package Stream_API;

import java.util.*;

public class SumUsingStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Sum: " + sum);
    }
}