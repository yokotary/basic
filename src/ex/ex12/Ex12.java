package ex.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//名前の完全一致で検索
class Ex12 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("あいざわ","男",25),
                new Person("おおた","女",18),
                new Person("えんどう","男",39),
                new Person("うえの","女",33),
                new Person("いのうえ","男",42)
        ));
        //一覧表示
        System.out.println("一覧表示");
        for (Person p:list) {
            System.out.println(p);
        }
        //検索する名前の入力
        Scanner in = new Scanner(System.in);
        System.out.println("検索する名前を入力");
        String name = in.nextLine();
        System.out.println(name);
        System.out.println("名前で検索してあるかないか");
        for (Person p:list) {
            if (name.equals(p.getName())) {
                System.out.println(name + "います");
                break;
            } else {
                System.out.println(name + "探しています");
            }

        }
    }
}
