package ex.ex17;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Person {
    //フィールド
    private String name;
    private Gender gender;
    private LocalDate birth;

    /*
    コンストラクタに与えるデータ形成
    名前　name 文字列
    性別　gender 列挙型 Gender
    誕生日 LocalDate 引数はISO文字列　String 2005-02-15
     */

    public Person(String name, Gender gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = LocalDate.parse(birth);
    }
    /*
    getter
        名前は文字列で、性別は「男 or 女」
        誕生日は 2005/02/15
        getAge()は年齢を取得できる
     */

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender.getName();
    }

    public String getBirth() {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
       return formatter.format(birth);
    }

    public Long getAge(){
        return ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d",
                getName(),getGender(),getBirth(),getAge());
    }
}
