package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayListの検索
class ArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Tom","Bob","Jhon"));
        System.out.println(list);

        //要素の検索
        if (list.contains("Bob")) {
            System.out.println(list.indexOf("Bob"));//ボブは何番目か
        } else {
            System.out.println("ボブなし");
        }
    }
}
