package ex.ex16;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ex16 {
    public static void main(String[] args) {
        List<String> zipCode = List.of("000-0000","1234-567","A23-b567","123-4567");
        List<String> phoneNo = List.of("03-1234-5678","011-234-5678","0123-12-9999","123-456-789");

        //正規表現パターン
        Pattern zipCodePattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        for (String z:zipCode){
            Matcher matcher = zipCodePattern.matcher(z);
            System.out.println(z + "は" + matcher.matches());
        }
        Pattern phoneNoPattern = Pattern.compile("^[0-9]{2}-[0-9]{4}-[0-9]{4}|" +
                "[0-9]{3}-[0-9]{3}-[0-9]{4}|" +
                "[0-9]{4}-[0-9]{2}-[0-9]{4}$");
        for (String p:phoneNo){
            Matcher matcher = phoneNoPattern.matcher(p);
            System.out.println(p + "は" + matcher.matches());
        }
    }
}
