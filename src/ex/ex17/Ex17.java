package ex.ex17;

import objectSample.exceptionSample.original.Gender;

import java.util.ArrayList;
import java.util.List;

class Ex17 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        List<Person> list = new ArrayList<>();
        //5人程度のインスタンスを追加する
        list.add(new Person("たなか", Gender.MEN,"2020-05-11"));
        list.add(new Person("たかこ",Gender.WOMEN,"1999-05-16"));
        list.add(new Person("やまだ",Gender.MEN,"1980-01-20"));
        list.add(new Person("よしこ",Gender.WOMEN,"1990-11-02"));
        list.add(new Person("たけし",Gender.MEN,"2000-11-11"));
        list.add(new Person("おおたに",Gender.WOMEN,"1995-07-08"));

        for (Person l:list) {
            System.out.println(l);
        }
    }
}
