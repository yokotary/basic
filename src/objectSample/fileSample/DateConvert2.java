package objectSample.fileSample;

import ex.ex14.Gender;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DataConvert2 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("相澤凜", Gender.WOMEN, LocalDate.parse("1996-08-22")),
                new Person("伊藤樹", Gender.MEN,LocalDate.parse("2002-02-07")),
                new Person("上野詩", Gender.WOMEN,LocalDate.parse("1984-04-15")),
                new Person("遠藤蓮", Gender.MEN,LocalDate.parse("1974-11-27")),
                new Person("太田紬", Gender.WOMEN,LocalDate.parse("1968-01-23"))
        ));
        //Person型　→　String型
        List<String> stringList = new ArrayList<>();
        for (Person p:personList){
            //toCsv()で一行の文字列に変換してArrayListに追加
            stringList.add(p.toCsv());
        }

        Path path = Paths.get("src","objectSample","fileSample","DC2.csv");

        try(BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            for (String s:stringList){
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}