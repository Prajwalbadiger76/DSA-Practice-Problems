package Stream_API;

import java.util.*;

public class CountNamesStartingWithR {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Ravi", "Prajwal", "Rohit");

        long count = names.stream()
                          .filter(name -> name.startsWith("R"))
                          .count();

        System.out.println("Count: " + count);
    }
}