package Stream_API;

import java.util.*;

public class RemoveDuplicatesStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,2,4,1,5);

        numbers.stream()
               .distinct()
               .forEach(System.out::println);
    }
}