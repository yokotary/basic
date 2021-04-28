package objectSample.updateSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class UpdatePerson {
    public static void main(String[] args) {
        //リストの初期化
        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("あいざわ","男",25),
                new Person("おおた","女",18),
                new Person("えんどう","男",39),
                new Person("うえの","女",33),
                new Person("いのうえ","男",42)
        ));

        //番号付き一覧表示
        System.out.println("修正前");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }

        //修正する対象の番号を入力
        System.out.print("何番を修正しますか？");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num + ":" + list.get(num));
        System.out.println("このデータを修正しますか？");
        String ans = scanner.nextLine();
        if ("y".equals(ans.toLowerCase())) {
            //修正処理
            Person p = list.get(num);//対象の読み込み
            System.out.print("名前:");//名前の入力メッセージ
            String name = scanner.nextLine();//名前の入力
            System.out.print("性別:");//性別の入力メッセージ
            String gender = scanner.nextLine();//名前の入力
            System.out.print("年齢:");//年齢の入力メッセージ
            int age = scanner.nextInt();//年齢の入力
            //各値のセット
            p.setName(name);
            p.setGender(gender);
            p.setAge(age);
        }

        //再度一覧表示
        System.out.println("修正後");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
    }
}
