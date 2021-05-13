package ex.ex14;

import java.util.ArrayList;
import java.util.List;

class Ex14 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("太郎",Gender.MEN,1,1,1,90,45,58));
        list.add(new Student("花子",Gender.WOMEN,1,1,2,60,35,68));
        list.add(new Student("健太",Gender.MEN,1,2,10,50,25,78));
        list.add(new Student("良子",Gender.WOMEN,1,2,3,70,15,88));
        list.add(new Student("次郎",Gender.MEN,1,3,4,10,95,98));
        list.add(new Student("京子",Gender.WOMEN,1,3,5,20,85,18));
        list.add(new Student("三郎",Gender.MEN,1,4,6,30,75,28));
        list.add(new Student("よしえ",Gender.WOMEN,1,4,7,40,65,38));
        list.add(new Student("四郎",Gender.MEN,1,5,20,50,45,48));
        list.add(new Student("りえこ",Gender.WOMEN,1,5,30,60,55,88));

        System.out.println("各クラスの国数英の平均");

        int JpSum = 0,MathSum = 0,EngSum = 0,cl = 0;
        double cnt = 0;

        for (int i = 1; i < 6; i++) {
            cl = i;
        for (Student s:list){
            if (s.getCl() == cl){
                JpSum += s.getJp();
                MathSum += s.getMath();
                EngSum += s.getEng();
                cnt++;
            }
        }
        System.out.println(String.format(cl + "組平均 : 国語:%.2f 数学:%.2f 英語:%.2f ",
                JpSum / cnt, MathSum / cnt, EngSum / cnt));
        }

    }

}
