package ex.ex15;

import ex.ex14.Gender;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Ex15 {
    //検索メソッド
    public static Optional<Person> searchPerson(Integer no,Map<Integer,Person>map){
        return Optional.ofNullable(map.get(no));
    }
    public static void main(String[] args) {
        /*
            Personクラスをフィールドnoで検索出来る処理をMapを使って作成しなさい。
            検索するメソッドsearchPersonを作成してOptional<Person>で戻り値を作成するメソッドを作成すること。
         */

        Map<Integer,Person> map = new HashMap<>();
        Person person1 = new Person(1,"Bob", Gender.MEN,28);
        Person person2 = new Person(2,"Hanako", Gender.WOMEN,48);

        map.put(person1.getNo(),person1);
        map.put(person2.getNo(),person2);
        System.out.println(map);

        int key = 1;
        searchPerson(key,map).ifPresentOrElse(
                p -> System.out.println(p),//存在した場合の処理
                () -> System.out.println("Not find."));//存在しなかった場合の処理

        key = 2;//存在しない
        searchPerson(key,map).ifPresentOrElse(
                p -> System.out.println(p),//存在した場合の処理
                () -> System.out.println("Not find."));//存在しなかった場合の処理
    }
}
