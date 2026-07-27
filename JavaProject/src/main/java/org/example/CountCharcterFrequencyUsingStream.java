package org.example;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class CountCharcterFrequencyUsingStream
{
    public static void main(String[] args) {
        String str= "hello";
        Map<Character, Long> frequencyMap = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
