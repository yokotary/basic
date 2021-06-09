package reviw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Apple {
    public static void main(String[] args) {
        List<Integer> apple = new ArrayList<>();
        apple.addAll(Arrays.asList(2,4,5,1,3));

        //大きいリンゴ求める
        Integer bigApple = apple.get(0);
        for (Integer i:apple) {
            if (bigApple < i) {
                bigApple = i;
            }
        }

        System.out.println("一番大きいリンゴは" + bigApple + "gです");

        //リンゴの大きい順に出力
        apple.sort(Comparator.reverseOrder());
        apple.forEach(System.out::println);
    }
}
