package main.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 25);

        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);

        maxNumber.ifPresent(max -> System.out.println("Maximum number is: " + max));
    }
}
