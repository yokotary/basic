package objectSample.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StreamSample2 {
    public static void main(String[] args) {
        //Streamを利用して連続した数値のリストを作成
        List<Integer> integerList = IntStream.rangeClosed(1,10).boxed()
            .collect(Collectors.toList());//

        integerList.stream()
                .map(i -> i*10)
                .filter(i -> i % 3 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
