package objectSample.dateTimeSample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;

class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime someDateTime = LocalDateTime.of(1999, 5, 15, 18, 0, 0);

        System.out.println(someDateTime.getYear());
        System.out.println(someDateTime.getMonth());
        System.out.println(someDateTime.getMonthValue());
        System.out.println(someDateTime.getDayOfMonth());
        System.out.println(someDateTime.getMinute());
        System.out.println(someDateTime.getSecond());
        System.out.println(someDateTime.getDayOfYear());
        System.out.println(someDateTime.getDayOfMonth());
        System.out.println(someDateTime.getDayOfWeek());
        System.out.println(someDateTime.getDayOfWeek().getValue());

        //１３日の金曜日が何回来たか
        int sum = 0;
        YearMonth month = YearMonth.of(1981, Month.JANUARY);
        YearMonth lastMonth = YearMonth.of(2021, Month.DECEMBER);
        while (month.isBefore(lastMonth) || month.equals(lastMonth)) {
            LocalDate day = month.atDay(13);
            if (day.getDayOfWeek() == DayOfWeek.FRIDAY) {
                sum++;
                //System.out.println(day);
            }
            month = month.plusMonths(1);
        }
            System.out.println("回数:" + sum);
    }
}
