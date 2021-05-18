package objectSample.mapSample;

import java.util.*;

class Map2 {
    //List → HashMapに変換
    public static Map<String,Member> toMap(List<Member> member) {
        Map<String,Member> memberMap = new HashMap<>();
        for(Member m:member) {
            memberMap.put(m.getName(),m);
        }
        return memberMap;
    }

    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.addAll(Arrays.asList(
                new Member("1","Tom"),
                new Member("2","Bob"),
                new Member("3","Jhon")
        ));

        System.out.println("一覧");
        System.out.println(member);

        System.out.println("変換");
        Map<String,Member> map = toMap(member);
        System.out.println(map);

        System.out.println("検索");
        String key = "";
        if (map.containsKey(key)) {
            //存在しているとき
            System.out.println(map.get(key));
        } else {
            //存在していないとき
            System.out.println(key + "は見つかりません");
        }

    }
}
