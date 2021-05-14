package ex.ex15;

import ex.ex14.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class Ex15 {
    public static void main(String[] args) {
        /*
            Personクラスをフィールドnoで検索出来る処理をMapを使って作成しなさい。
            検索するメソッドsearchPersonを作成してOptional<Person>で戻り値を作成するメソッドを作成すること。
         */

        List<Optional<Person>> person = new ArrayList<>();
        person.add(Optional.ofNullable(new Person(1,"taro",Gender.MEN,20)));
        person.add(Optional.ofNullable(new Person(2,"hana",Gender.WOMEN,20)));


        Map<Integer,Person> map = new HashMap<>();

        //System.out.println(map);



    }
}
