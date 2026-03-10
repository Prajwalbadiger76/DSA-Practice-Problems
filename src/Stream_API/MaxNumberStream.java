package Stream_API;

import java.util.*;

public class MaxNumberStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 45, 23, 67, 34);

        int max = numbers.stream()
                         .max(Integer::compare)
                         .get();

        System.out.println("Maximum number: " + max);
    }
}