package test.fileTest;

import ex.ex14.Gender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Test {
//    //全体の平均
//    public double getAllAve(){
//        return
//    }
    public static void main(String[] args) {
        //ファイルがあるかどうか判断してあれば読み込んで並び替える、なければ作って生徒のデータ書き込む
        Path humanPath = Paths.get("src", "test","human.csv");
        List<Student> studentList = new ArrayList<>();
        //humanPathがあったら
        if (Files.exists(humanPath)) {
            //読み込み
            try (BufferedReader br = Files.newBufferedReader(humanPath)){
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
            //新規書き込み
            Path sortFilePath = Paths.get("src", "test","sortAve.csv");
            try (BufferedWriter bw = Files.newBufferedWriter(sortFilePath, StandardOpenOption.APPEND)){
                for (Student s:studentList) {
                    bw.write(String.valueOf(s));
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else //humanPathが無かったら作る
             {
                 List<String> humanList = new ArrayList<>();
                 humanList.addAll(Arrays.asList(
                         "あきば,男,1,1,1,80,50,60",
                         "こんどう,女,1,5,14,100,100,100",
                         "うえの,男,1,2,4,90,90,100"
                 ));
            try (BufferedWriter bw = Files.newBufferedWriter(humanPath)){
                for (String s:humanList){
                    bw.write(s);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
             }
    }
}
