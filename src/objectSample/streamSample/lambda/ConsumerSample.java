package objectSample.streamSample.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ConsumerSample {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/function/Consumer.html
        List<Integer> integerList = new ArrayList<>();
        //Consumer<引数の型> 変数名 = 引数 -> 戻り値;
        Consumer<String> consumer1 = s -> System.out.println(s + "です");
        Consumer<Integer> consumer2 = i -> integerList.add(i);

        //acceptで実行
        consumer1.accept("これは猫");
        consumer2.accept(100);
        consumer2.accept(10);

        integerList.stream()
                .forEach(System.out::println);
    }
}
