package ex.ex21;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Ex21 {
    public static void main(String[] args) {
        //１から１００までの整数型ArrayListを作成する
        List<Integer> integerList = IntStream.rangeClosed(1,100).boxed()
                .collect(Collectors.toList());
        //偶数のみを処理する
        integerList.stream()
                .filter(i -> i % 2 ==0)
        //対象の数値を3倍する
                .map(i -> i * 3)
        //数値の大きいものから表示する
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
