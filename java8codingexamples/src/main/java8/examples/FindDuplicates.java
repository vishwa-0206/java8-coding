package main.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 9, 1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers are: " + duplicates);
    }
}
