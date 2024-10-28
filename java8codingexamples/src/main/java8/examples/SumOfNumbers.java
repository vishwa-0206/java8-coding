package main.java8.examples;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers is: " + sum);
    }
}
