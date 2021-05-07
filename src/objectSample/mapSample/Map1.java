package objectSample.mapSample;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //値の追加
        map.put("Apple","りんご");
        map.put("Banana","バナナ");
        map.put("Orange","オレンジ");
        System.out.println(map);
        //forで表示
       for (Map.Entry<String,String>entry:map.entrySet()) {
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }

       //keyを指定して取得
        System.out.println(map.get("Apple"));//リンゴ
        System.out.println(map.get("abc"));//null

        //Keyが存在することを確認してからgetする
        if (map.containsKey("Apple")) {
            System.out.println(map.get("Apple"));
        } else {
            System.out.println("Key:Appleは存在しません");
        }

        //値の存在を調べる
        String word = "リンゴ";
        if (map.containsValue(word)) {
            System.out.println(word + "は存在します");
        } else {
            System.out.println(word + "は存在しません");
        }

        //値の変更
        System.out.println(map);
        System.out.println(map.put("Apple", "iphone"));
        System.out.println(map.put("Android", "arrows"));
        System.out.println(map);

        //Keyの集合を取得
        System.out.println(map.keySet());

        //値のコレクションを取得
        System.out.println(map.values());

        //Keyを指定して値の削除
        String Key = "Apple";
        if (map.containsKey(Key)) {
            map.remove(Key);
        }
        System.out.println(map);
    }
}
