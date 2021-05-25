package objectSample.stringSample;

import ex.ex14.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Person {
    private String name;
    private Gender gender;
    private LocalDate birth;
    //コンストラクタ
    public Person(String name, Gender gender, LocalDate birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }
    //ゲッター
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d",name,gender.getName(),birth,getAge());
    }
    //年齢を取得するメソッド
    public Long getAge(){
        return ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }
}
