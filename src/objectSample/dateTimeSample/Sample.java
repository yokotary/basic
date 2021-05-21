
package objectSample.dateTimeSample;

import java.time.LocalDate;

//進藤さんのリクエスト
class Sample {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.parse("1981-11-25");
        LocalDate check = null;
        int count = 0;

        if (birth.getDayOfMonth() > 13 ) {
            check = birth.plusMonths(1).withDayOfMonth(1);
        } else {
            check = birth.withDayOfMonth(1);
        }

        do {
            if (check.getDayOfWeek().getValue() == 7) {
                count++;
                System.out.println(check.withDayOfMonth(13));
            }
            check = check.plusMonths(1);
        } while (check.isBefore(LocalDate.now()));

        System.out.println(count);
    }
}