package objectSample.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamSample8 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4, 8, 5, 9, 1, 3, 7, 2, 8, 6, 0);
        System.out.println("値の一覧");
        System.out.println(integerList);

        System.out.println("最初の要素");
        integerList.stream().findFirst().ifPresent(System.out::println);
        System.out.println("どれかの要素");
        integerList.stream().findAny().ifPresent(System.out::println);
        System.out.println("最大値");
        integerList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        System.out.println("最小値");
        integerList.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        System.out.println("重複を省く");
        List<Integer> distinctList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        //Mapに変換
        List<Data> dataList = List.of(
                new Data("101","あああ"),
                new Data("104","えええ"),
                new Data("103","かかか")
        );

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Collectors.html
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Collectors.html#toMap(java.util.function.Function,java.util.function.Function,java.util.function.BinaryOperator,java.util.function.Supplier)
        Map<String,Data> dataMap = dataList.stream()
                .collect(Collectors.toMap(d -> d.getId(), d -> d));

    }

}