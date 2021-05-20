package objectSample.dateTimeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//日時の初期化
class DateTimeSample {
    public static void main(String[] args) {
        //現在日時
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowDateTime);

        //任意の日時を指定
        LocalDate someDate = LocalDate.of(1981,11,25);
        LocalTime someTime = LocalTime.of(18,0,0,0);
        LocalDateTime someDateTime = LocalDateTime.of(1981, Month.NOVEMBER, 25, 18, 0, 0);
        System.out.println(someDate);
        System.out.println(someTime);
        System.out.println(someDateTime);

        //日付文字列から
        LocalDate parseDate = LocalDate.parse("2020-01-01");
        LocalTime parseTime = LocalTime.parse("21:00:00");
        LocalDateTime parseDateTime = LocalDateTime.parse("2020-01-01T21:00:00");
        System.out.println(parseDate);
        System.out.println(parseTime);
        System.out.println(parseDateTime);
    }
}
