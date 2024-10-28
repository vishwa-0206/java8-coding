package main.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Zara");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
