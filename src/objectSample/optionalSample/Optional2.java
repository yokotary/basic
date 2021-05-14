package objectSample.optionalSample;

import java.util.Optional;

//Optionalの使い方
class Optional2 {
    public static void main(String[] args) {
        //生成
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);
        //取得
        opt1.ifPresent(v -> System.out.println(v));//abc
        opt2.ifPresent(v -> System.out.println(v));//見つからなかったら実行しない
    }
}
