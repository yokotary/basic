package ex.ex19;

import ex.ex14.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    Ex14のStudentクラスを再利用して処理を行う
    国数英の3科目の合計点の降順で生徒の情報を出力すること
    出力例
    こんどう 女 1 5 14 100 100 100 300
    うえの 男 1 2  4  90  90 100 280
    あきば 男 1 1  1  80  50  60 190
 */
class Ex19 {
    public static void main(String[] args) {
        //ファイル読み込み
        Path path = Paths.get("src","ex","ex19","Student.csv");
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path)){
            //一行読み込む
            String line = br.readLine();
            while (line != null){
                stringList.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
                //System.out.println(stringList);

            List<Student> studentList = new ArrayList<>();
        for (String s:stringList) {
            String[] splitDate = s.split(",",8);
            String name = splitDate[0];//Stringのnameを定義
            Gender gender = null;//String型のsplitDate[1]をGender型に
            if ("男".equals(splitDate[1])){
                gender = Gender.MEN;
            } else {
                gender = Gender.WOMEN;
            }
            int grade = Integer.parseInt(splitDate[2]);
            int cl = Integer.parseInt(splitDate[3]);
            int no = Integer.parseInt(splitDate[4]);
            int jp = Integer.parseInt(splitDate[5]);
            int math = Integer.parseInt(splitDate[6]);
            int eng = Integer.parseInt(splitDate[7]);
            Student student = new Student(name,gender,grade,cl,no,jp,math,eng);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getSum,Comparator.reverseOrder()));
        for (Student s:studentList) System.out.println(s);
    }
}