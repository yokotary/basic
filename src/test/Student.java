package test;

import ex.ex14.Gender;

class Student {
    private int no;
    private String name;
    private Gender gender;
    private  int grade;
    private  int cl;
    private int jp;
    private int math;
    private int eng;

    public Student(String name, Gender gender, int grade, int cl, int no, int jp, int math, int eng) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.cl = cl;
        this.jp = jp;
        this.math = math;
        this.eng = eng;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getJp() {
        return jp;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d,%2d,%3d,%3d,%3d",name,gender.getName(),grade,cl,no,jp,math,eng);
    }
    //合計のメソッド
    public int getSum(){
        return jp+math+eng;
    }
    //平均のメソッド
    public double getAve(){
        return getSum() / 3.0;
    }

}
