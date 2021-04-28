package ex.ex11;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Ex11 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        List<Person> list = new ArrayList<>();
        //5人程度のインスタンスを追加する
        list.add(new Person("たなか","男",22));
        list.add(new Person("たかこ","女",33));
        list.add(new Person("やまだ","女",44));
        list.add(new Person("よしこ","女",55));
        list.add(new Person("たけし","男",66));
        list.add(new Person("おおたに","男",10));
        //一覧表示
        for (Person v:list) {
            System.out.println(v);
        }

        //年齢の降順表示
        System.out.println("年齢の降順表示");
        list.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        for (Person v:list) {
            System.out.println(v);
        }
        //男性で年齢の降順で出力
        System.out.println("男性で年齢の降順で出力");
        List<Person> list2 = new ArrayList<>();
        for (Person v:list) {
            if ("男".equals(v.getGender())) {
                list2.add(v);
            }
        }
        list2.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        for (Person v:list2) {
            System.out.println(v);
        }
    }
}
