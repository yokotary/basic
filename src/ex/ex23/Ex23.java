package ex.ex23;

import ex.ex14.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Ex23 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("太郎", Gender.MEN, 1, 1, 1, 90, 45, 58));
        list.add(new Student("花子", Gender.WOMEN, 1, 1, 2, 60, 35, 68));
        list.add(new Student("健太", Gender.MEN, 1, 2, 10, 50, 25, 78));
        list.add(new Student("良子", Gender.WOMEN, 1, 2, 3, 70, 15, 88));
        list.add(new Student("次郎", Gender.MEN, 1, 3, 4, 10, 95, 98));
        list.add(new Student("京子", Gender.WOMEN, 1, 3, 5, 20, 85, 18));
        list.add(new Student("三郎", Gender.MEN, 1, 4, 6, 30, 75, 28));
        list.add(new Student("よしえ", Gender.WOMEN, 1, 4, 7, 40, 65, 38));
        list.add(new Student("四郎", Gender.MEN, 1, 5, 20, 50, 45, 48));
        list.add(new Student("りえこ", Gender.WOMEN, 1, 5, 30, 60, 55, 88));

        List<Student> aveList = new ArrayList<>();
        System.out.println("各クラスの国数英の平均");


        //クラスごと国語平均
        System.out.println("国語平均");
        Map<Integer, Double> jpGroup = list.stream()
                .collect(Collectors.groupingBy(Student::getCl, Collectors.averagingDouble(Student::getJp)));

        jpGroup.entrySet().stream()
                .map(e -> e.getKey() + "組 :" + e.getValue() + "点")
                .forEach(System.out::println);

        //クラスごと数学平均
        System.out.println("数学平均");
        Map<Integer, Double> mathGroup = list.stream()
                .collect(Collectors.groupingBy(Student::getCl, Collectors.averagingDouble(Student::getMath)));

        mathGroup.entrySet().stream()
                .map(e -> e.getKey() + "組 :" + e.getValue() + "点")
                .forEach(System.out::println);
        //クラスごと英語平均
        System.out.println("英語平均");
        Map<Integer, Double> engGroup = list.stream()
                .collect(Collectors.groupingBy(Student::getCl, Collectors.averagingDouble(Student::getEng)));

        engGroup.entrySet().stream()
                .map(e -> e.getKey() + "組 :" + e.getValue() + "点")
                .forEach(System.out::println);

        List<Map<Integer, Double>> IntStu = List.of(jpGroup, mathGroup, engGroup);
        System.out.println(IntStu);

        /*
         *     System.out.println("一覧表示");
        list.forEach(System.out::println);

        //分類
        Map<Integer,List<Student>> studentMap = list.stream()
                .collect(Collectors.groupingBy(Student::getCl));

        System.out.println("グループ分け");
        studentMap.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue().toString())
                .forEach(System.out::println);


        System.out.println("クラスごとの平均");
        studentMap.entrySet().stream()
                .map(e -> {
                    Integer cl = e.getKey();
                    List<Student> studentList = e.getValue();
                    OptionalDouble aveJap = studentList.stream().mapToDouble(Student::getJap).average();
                    OptionalDouble aveMath = studentList.stream().mapToDouble(Student::getMath).average();
                    OptionalDouble aveEng = studentList.stream().mapToDouble(Student::getEng).average();
                    return String.format("1-%d %.2f %.2f %.2f",
                            cl,aveJap.orElse(0),aveMath.orElse(0) , aveEng.orElse(0));
                })
                .forEach(System.out::println);
         */
    }
}

