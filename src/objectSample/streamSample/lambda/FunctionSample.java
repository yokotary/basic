package objectSample.streamSample.lambda;

import java.util.function.Function;

class FunctionSample {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/function/Function.html
        //Function<引数の型,戻り値の型> 変数名 = 引数 -> 戻り値;
        Function<Integer, Integer> function1 = i -> i *2;
        Function<String, Integer> function2 = s -> s.length();

        System.out.println(function1.apply(10));
        System.out.println(function2.apply("apple"));
    }
}
