package ex.ex23;

import ex.ex14.Gender;

//生徒クラス
class Student {
    //フィールド
    private int no;
    private String name;
    private Gender gender;
    private  int grade;
    private  int cl;
    private int jp;
    private int math;
    private int eng;

    //コンストラクタ
    public Student(String name, Gender gender, int grade, int cl, int no, int jp, int math, int eng) {
        this.no = no;
        this.gender = gender;
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.jp = jp;
        this.math = math;
        this.eng = eng;
    }

    //ゲッター
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
        return String.format("%s %s %d %d %2d %3d %3d %3d %3d %.2f",
                name,gender.getName(),grade,cl,no,jp,math,eng,getSum(),getAve());
    }

    //個人合計を求めるメソッドを作成する
    public int getSum() {
        return jp + math + eng;
    }

    //個人平均を求めるメソッドを作成する
    public double getAve() {
        return getSum() /3.0;
    }
}