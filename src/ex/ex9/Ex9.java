package ex.ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

class Ex9 {
    public static void main(String[] args) {
        //1-10までの整数を格納したArrayListを作成しなさい
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Arrays.toString(list.toArray()));

        //それらを合計した値を表示しなさい
        int sum = 0;
        for (int i = 0; i < list.toArray().length; i++) {
            sum += list.get(i);
        }
        System.out.println("合計"+sum);
        //それらの平均を表示しなさい
        double ave = 0;
        ave = (double) sum/list.toArray().length;
        System.out.println("平均"+ave);
    }
}
