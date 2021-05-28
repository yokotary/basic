package test;

import ex.ex14.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Test {
//    //全体の平均
//    public double getAllAve(){
//        return
//    }
    public static void main(String[] args) {
        //ファイルがあるかどうか判断してあれば読み込んで並び替える、なければ作る
        Path human = Paths.get("src","test","human.csv");
        List<Student> studentList = new ArrayList<>();
        if (Files.exists(human)) {
            //読み込み
            try (BufferedReader br = Files.newBufferedReader(human)){
                String line = br.readLine();
                while (line != null){
                    String[] data = line.split(",",8);
                    String name = data[0];
                    Gender gender = "男".equals(data[1]) ? Gender.MEN:Gender.WOMEN;
                    int grade = Integer.parseInt(data[2]);
                    int cl = Integer.parseInt(data[3]);
                    int no = Integer.parseInt(data[4]);
                    int jap = Integer.parseInt(data[5]);
                    int math = Integer.parseInt(data[6]);
                    int eng = Integer.parseInt(data[7]);
                    studentList.add(new Student(name,gender,grade,cl,no,jap,math,eng));

                    line = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //平均点の高い順に並び替え
            studentList.sort(Comparator.comparing(Student::getAve,Comparator.reverseOrder()));
            Path newFile = Paths.get("src","test","sortAve.csv");
        }
    }
}
