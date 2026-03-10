package Stream_API;

import java.util.*;

public class UppercaseUsingStream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("prajwal", "ram", "john");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}