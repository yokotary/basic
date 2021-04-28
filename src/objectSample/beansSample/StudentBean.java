package objectSample.beansSample;

//beanサンプル
public class StudentBean {
    //フィールド
    private int no;
    private String name;
    private int grade;
    private int cl;
    private int jp;
    private int math;
    private int eng;

    //引数なしコンストラクタ
    public StudentBean() {
    }
    //ゲッターとセッター両方あるものをbeansという
    //ゲッターとセッターを作成する
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }

    public int getJp() {
        return jp;
    }

    public void setJp(int jp) {
        this.jp = jp;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %2d %3d %3d %3d %3d %.2f",
                name,grade,cl,no,jp,math,eng,getSum(),getAve());
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
