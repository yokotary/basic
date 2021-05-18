package objectSample.stringSample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatchesSample {
    public static void main(String[] args) {
        //基本的な正規表現
        String sentence1 = "This is a pen."; //検索対象
        String sentence2 = "That is a pen."; //検索対象
        String regex = "This is a .*\\."; //正規表現
        System.out.println(sentence1.matches(regex)); //true
        System.out.println(sentence2.matches(regex)); //false

        //繰り返しで正規表現を比較する^から$までの範囲が正規表現
        Pattern pattern = Pattern.compile("^[A-z]+$");//正規表現パターン（英字のみ）
        List<String> sentenceList = List.of("Apple","1234","cat1","book");

        for (String s:sentenceList){
            Matcher matcher = pattern.matcher(s);
            System.out.println(s + ":" + matcher.matches());
        }
    }
}

