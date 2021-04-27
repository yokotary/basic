package ex.ex10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Ex10 {
    public static void main(String[] args) {
        //Studentのインスタンスを格納するArrayListを作成し、
        // 6人分のインスタンスを作成しなさい。
        //1～3学年を二人ずつ作成し、1組と2組の学生で作りなさい。
        List<Student> list = new ArrayList<>();
        list.add(new Student("文系太郎",1,1,10,90,45,88));
        list.add(new Student("理系花子",1,2,10,70,95,78));
        list.add(new Student("文系田中",2,1,10,95,65,78));
        list.add(new Student("理系吉田",2,2,10,60,77,55));
        list.add(new Student("文系中村",3,1,10,80,65,98));
        list.add(new Student("理系西田",3,2,10,50,75,50));

        //生徒の一覧を表示しなさい。
        System.out.println("生徒の一覧を表示しなさい。");
        for (Student v:list) {
            System.out.println(v);
        }

        //1年生のみ一覧表示しなさい。
        System.out.println("1年生のみ一覧表示しなさい。");
        for (Student v:list) {
        if (v.getGrade() == 1) {
            System.out.println(v);
        };
        }
        //1組だけ一覧表示しなさい。
        System.out.println("1組だけ一覧表示しなさい。");
        for (Student v:list) {
            if (v.getCl() == 1) {
                System.out.println(v);
            }
        }

        //全員を対象に国語の得点の降順に並び替えて一覧表示しなさい。
        System.out.println("全員を対象に国語の得点の降順に並び替えて一覧表示しなさい。");
        list.sort(Comparator.comparing(Student::getJp,Comparator.reverseOrder()));
        for (Student v:list) {
            System.out.println(v);
        }
        //3年生の各科目の平均を表示しなさい。
        //↓間違えて全科目の平均出したやつ
        int sum = 0;
        double sanAve = 0;
        for (Student v:list) {
            if (v.getGrade() == 3){
                sum += v.getJp();
                sum += v.getMath();
                sum += v.getEng();
            }
        }
        sanAve = (double) sum/list.size();
        System.out.println("３年生の全科目平均"+sanAve);

        //↓3年生の各科目の平均
        System.out.println("3年生の各科目の平均");
        int jpSum = 0,mathSum = 0,engSum = 0,grade = 3;
        double cnt = 0;
        for (Student v:list) {
            if (v.getGrade() == grade){
                jpSum += v.getJp();
                mathSum += v.getMath();
                engSum += v.getEng();
                cnt++;
            }
        }
        System.out.println(String.format("国語:%.2f 数学:%.2f 英語:%.2f ",
                jpSum / cnt,mathSum/cnt,engSum/cnt));
    }
}
