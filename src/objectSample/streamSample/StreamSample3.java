package objectSample.streamSample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

class StreamSample3 {
    public static void main(String[] args) {
        //Streamへの変換
        System.out.println("List → Stream");
        List<String> stringList = List.of("Bob","Tom","Jack");
        stringList.stream()
                .forEach(System.out::println);

        //Set → Stream
        System.out.println("Set → Stream");
        Set<String> stringSet = Set.of("Bob","Tom","Jack");
        stringSet.stream()
                .forEach(System.out::println);

        //配列　→　Stream
        System.out.println("配列　→　Stream");
        String[] stringArray = {"Bob","Tom","Jack"};
        Arrays.stream(stringArray)
                .forEach(System.out::println);

        //Map → Stream
        System.out.println("Map → Stream");
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Bob","ボブ");
        stringMap.put("Tom","トム");
        stringMap.put("Jack","ジャック");

        stringMap.entrySet().stream()//entryはキーと値のペアのこと
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        //数値範囲
        IntStream intStream1 = IntStream.range(1,10);//1～9
        intStream1.forEach(System.out::println);
        System.out.println("rangeClosedは末尾も含む");
        IntStream intStream2 = IntStream.rangeClosed(1,10);//1～10
        intStream2.forEach(System.out::println);

    }
}
