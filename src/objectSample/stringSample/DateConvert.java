package objectSample.stringSample;

import ex.ex14.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//CSV → Person
class DateConvert {
    public static void main(String[] args) {
        //ファイルの読み込み
        //場所の設定
        Path path = Paths.get("src","objectSample","fileSample","input.csv");
        List<String> readDate = new ArrayList<>();//この中に読み込んだデータ入れる
        try (BufferedReader br = Files.newBufferedReader(path)){
            String line = br.readLine();//一行読み込む
            while (line != null){
                readDate.add(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //出力
        for (String line:readDate) System.out.println(line);

        //文字列→Personのインスタンスに
        List<Person> personList = new ArrayList<>();
        //for文でsplitを繰り返して名前、性別、誕生日で分割
        for (String line:readDate){
            String[] splitDate = line.split(",",3);//データを,で分割
            /*
            * System.out.println(splitDate[0]);
            System.out.println(splitDate[1]);
            System.out.println(splitDate[2]);
            * */
            String name = splitDate[0];//Stringのnameを定義
            Gender gender = null;//String型のsplitDate[1]をGender型に
            if ("男".equals(splitDate[1])){
                gender = Gender.MEN;
            } else {
                gender = Gender.WOMEN;
            }
            LocalDate birth = LocalDate.parse(splitDate[2]);//String型のsplitDate[2]をLocalDate型に
            Person person = new Person(name,gender,birth);
            personList.add(person);
        }
        //出力
        for (Person p:personList) System.out.println(p);
        //降順で出力
        System.out.println("降順で出力");
        personList.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));//参照ArrayList3
        for (Person p:personList) System.out.println(p);
    }
}
