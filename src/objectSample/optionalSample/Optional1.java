package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方
class Optional1 {
    public static void main(String[] args) {
        //生成
        Optional<String> opt1 = Optional.of("abc");
        //取得
        System.out.println(opt1.get());
        //nullだと例外になる
        Optional<String> opt2 = Optional.of(null);
//        System.out.println(opt2.get());
    }
}
