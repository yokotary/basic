package ex.ex22;

import ex.ex14.Gender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Ex22 {
    public static void main(String[] args) {
        Path path = Paths.get("src","ex","ex22","Student.csv");
        List<Student> studentList = new ArrayList<>();
        Function<String,Student> toStudent = s -> {
            String[] column = s.split(",",8);
            return new Student(column[0],"男".equals(column[1]) ? Gender.MEN:Gender.WOMEN,
                    Integer.parseInt(column[2]),
                    Integer.parseInt(column[3]),
                    Integer.parseInt(column[4]),
                    Integer.parseInt(column[5]),
                    Integer.parseInt(column[6]),
                    Integer.parseInt(column[7]));
        };

        try (Stream<String> lines = Files.lines(path)){
            studentList = lines
                    .map(toStudent)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentList.stream().sorted(Comparator.comparing(Student::getSum,Comparator.reverseOrder()))
                .forEach(System.out::println);

        //より短い書き方
        //変数宣言
//        Path path = Paths.get("src","ex","ex22","student.csv");
//        List<Student> studentList = new ArrayList<>();
//
//        //読み込みとList化
//        try (Stream<String> lines = Files.lines(path)) {
//            studentList = lines
//                    .map(s -> s.split(",",8))
//                    .map(s -> {
//                        return new Student(
//                                s[0],
//                                "男".equals(s[1]) ? Gender.MEN:Gender.WOMEN,
//                                Integer.parseInt(s[2]),
//                                Integer.parseInt(s[3]),
//                                Integer.parseInt(s[4]),
//                                Integer.parseInt(s[5]),
//                                Integer.parseInt(s[6]),
//                                Integer.parseInt(s[7])
//                        );
//                    })
//                    .collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //ソートと出力
//        studentList.stream()
//                .sorted(Comparator.comparing(Student::getSum,Comparator.reverseOrder()))
//                .forEach(System.out::println);
//    }
//
//
   }
}
