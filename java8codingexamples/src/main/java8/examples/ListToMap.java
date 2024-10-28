package main.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear");

        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(word -> word, String::length));

        System.out.println(wordLengthMap);
    }
}
