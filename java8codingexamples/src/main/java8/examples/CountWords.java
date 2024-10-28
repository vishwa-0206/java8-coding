package main.java8.examples;

import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape", "avocado");

        long count = words.stream()
                .filter(word -> word.startsWith("a"))
                .count();

        System.out.println("Number of words starting with 'a': " + count);
    }
}
