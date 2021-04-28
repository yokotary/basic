package objectSample.beansSample;

import java.util.ArrayList;
import java.util.List;

public class BeansSample {
    public static void main(String[] args) {
        //↓こいつbean
        List<StudentBean>list = new ArrayList<>();
        //各項目のデータを用意する
        String name = "やまだ";
        int grade = 1;
        int cl = 1;
        int no = 22;
        int jp = 55;
        int math = 66;
        int eng = 77;

        //Beansに追加する
        StudentBean studentBean = new StudentBean() ;
        studentBean.setName(name);
        studentBean.setGrade(grade);
        studentBean.setCl(cl);
        studentBean.setNo(no);
        studentBean.setJp(jp);
        studentBean.setMath(math);
        studentBean.setEng(eng);
        list.add(studentBean);
    }
}
