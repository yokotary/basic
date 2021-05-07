package objectSample.setSample;

import java.util.*;

//Setサンプル
class Set1 {
    public static void main(String[] args) {
        //整数型HashSetを定義
        Set<Integer> set = new HashSet<>();
        //データを追加する
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        //存在する値は追加されない
        System.out.println(set.add(1));//false
        System.out.println(set);
        //存在しない値は追加される
        System.out.println(set.add(6));//true
        System.out.println(set);
        //値を複数追加する
        System.out.println(set.addAll(Arrays.asList(7, 8, 9)));
        System.out.println(set);
        //一部だけ追加できるパターン true
        System.out.println(set.addAll(Arrays.asList(9,10)));
        System.out.println(set);
        //値の削除
        System.out.println(set.remove(10));
        System.out.println(set);
        //削除できなかったパターン
        System.out.println(set.remove(10));
        System.out.println(set);
        //合致する値をすべて削除する
        System.out.println(set.removeAll(Arrays.asList(7, 8, 9)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6, 7)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6, 7)));//false
        System.out.println(set);
        //合致しない値をすべて削除する
        System.out.println(set.retainAll(Arrays.asList(1, 2, 3)));//true
        System.out.println(set);
        //値をすべて削除
        set.clear();
        System.out.println(set);
        //サイズの取得
        System.out.println(set.size());
        //空かどうか？ 空ならtrue if文とかで使える
        System.out.println(set.isEmpty());
        //ArrayListからSet変換
        //重複するデーターを省いて存在するデータの種類だけ表示
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,3));
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);//1,2,3
        //値の存在を確認する
        System.out.println(integerSet.contains(2));//true
        System.out.println(integerSet.contains(4));//false
        System.out.println(integerSet.contains(Arrays.asList(1, 2, 3)));//true
        System.out.println(integerSet.contains(Arrays.asList(1, 2, 4)));//false
    }
}
