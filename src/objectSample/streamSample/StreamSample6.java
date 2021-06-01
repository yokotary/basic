package objectSample.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class StreamSample6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);

        //合計を求める
        int sum = integerList.stream()
                .mapToInt(i -> i)//IntStreamに変換
                .sum();//合計を求める
        System.out.println(sum);//15

        //平均を求める
        OptionalDouble ave = integerList.stream()
                .mapToDouble(i -> (double) i)
                .average();//平均はdoubleではなくOptionalDoubleで返ってくる、型もOptionalDoubleにしなくてはならない

        System.out.println(ave.orElse(0));

        //データの個数を求める
        Long count = integerList.stream()
                .filter(i -> i % 2 == 1)
                .count();//これもLong型で返ってくる
        System.out.println(count);

        //最小値を求める
        Optional<Integer> min = integerList.stream()
                .min(Comparator.naturalOrder());
        System.out.println(min);

        //最大値を求める
        Optional<Integer> max = integerList.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max);
    }
}
