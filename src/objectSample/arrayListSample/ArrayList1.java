package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayList1 {
    public static void main(String[] args) {
        //List<データの型> 変数名 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        //データの追加
        list.add(10);
        list.add(20);
        list.add(30);
        //データの取得・参照
        System.out.println(list.get(0));//０番目の要素を表示
        System.out.println(list.get(1));//1番目の要素を表示
        System.out.println(list.get(2));//2番目の要素を表示
        System.out.println(Arrays.toString(list.toArray()));//配列にして出力
        for (Integer i:list){
            System.out.println(i);
        }
        //データの挿入
        list.add(1,50);//index1番目に50を追加
        System.out.println(Arrays.toString(list.toArray()));
        //データの末尾に複数追加
        list.addAll(Arrays.asList(100,60,90));
        System.out.println(Arrays.toString(list.toArray()));
        list.addAll(2,Arrays.asList(40,80,70));//データを指定の位置に挿入
        System.out.println(Arrays.toString(list.toArray()));

        //データの削除
        list.remove(0);//index０番目消せ
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(Integer.valueOf(100));//100消せ
        System.out.println(Arrays.toString(list.toArray()));
        list.removeAll(Arrays.asList(40,50,100));//一致したもの
        System.out.println(Arrays.toString(list.toArray()));
        list.retainAll(Arrays.asList(30,60,90));//一致しないもの
        System.out.println(Arrays.toString(list.toArray()));

        //値の変更
        list.set(0,0);//index０番目を0にする
        System.out.println(Arrays.toString(list.toArray()));

        //クリア（全部消す）
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));

        //サイズの取得
        System.out.println(list.size());
        //空かどうか？ 空ならtrue if文とかで使える
        System.out.println(list.isEmpty());

    }
}
