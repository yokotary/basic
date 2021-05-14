package ex.ex15;

import ex.ex14.Gender;

class Person {
    private Integer no;
    private String name;
    private Gender gender;
    private int age;
    //コンストラクタ
    public Person(Integer no,String name,Gender gender,int age){
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //ゲッター
    public Integer getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d",no,name,gender.getName(),age);
    }
}
