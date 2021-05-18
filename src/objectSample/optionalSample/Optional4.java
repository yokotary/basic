package objectSample.optionalSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Optional4 {
    public static void main(String[] args) {
        //ofNullableは()の中身がnull以外だったら表示する
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);

        //Nullな場合に別の値を返す
        //orElseはNullなとき()に書き換える
        System.out.println(opt1.orElse("hoge"));
        System.out.println(opt2.orElse("hoge"));

        //Nullかどうか判断する
        //isPresentはNullかどうかをブーリアン型で返す
        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());


        //値をフィルターする
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#filter(java.util.function.Predicate)
        List<Optional<Integer>> optionalList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            optionalList.add(Optional.ofNullable(i));
        }

        //v -> v >= 5 がtrueなら値の入っているOptionalを返す
        //空で無ければ出力をする
        System.out.println("値のフィルター");
        for (Optional<Integer> opt:optionalList) {
            opt.filter(v -> v >= 5).ifPresent(v -> System.out.println(v));
        }

        //.mapは値を加工する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#map(java.util.function.Function)
        System.out.println("値を加工する");
        for (Optional<Integer> opt:optionalList) {
            //vは引数！
            opt.map(v -> v*2).ifPresent(v -> System.out.println(v));
        }
    }
}
