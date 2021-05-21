package objectSample.dateTimeSample;

import java.time.LocalDateTime;

class DateTimeSample4 {
    public static void main(String[] args) {
        //日付の計算
        LocalDateTime now = LocalDateTime.now();
         //加算
        System.out.println(now.plusYears(1));//一年後
        System.out.println(now.plusMonths(1));//一か月後
        System.out.println(now.plusWeeks(1));//一週間後
        //値を調整
        System.out.println(now.withYear(3000));//年を変更
        System.out.println(now.withMonth(8));//月を変更
        System.out.println(now.withDayOfMonth(5));//日にちを変更
    }
}
