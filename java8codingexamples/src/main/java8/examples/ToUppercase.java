package main.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "peter", "alice");

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}
