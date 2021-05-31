package objectSample.streamSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StreamSample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("a","b","c"));

        stringList.stream()
                .forEach(System.out::println);
        //.forEach(s -> System.out.println(s));と同じ
    }
}
