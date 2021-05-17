package objectSample.stringSample;

import java.util.Arrays;
import java.util.List;

class StringSample {
    public static void main(String[] args) {
        System.out.println("aとbをくっつける");
        String a = "abc", b = "def";
        System.out.println(a + b);
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        System.out.println(a.concat(b));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...)
        System.out.println(String.join("", a, b));
        System.out.println(",で区切る");
        List<String> list = List.of("a","b","c");
        System.out.println(String.join(",", list));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#equals(java.lang.Object)
        System.out.println("比較して同じならtrue");
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("ABC"));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)
        System.out.println("Unicode値で比較して離れている数をint型で返す");
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("ABC"));
        System.out.println("abc".compareTo("xyz"));

        //大文字か小文字かを区別せず比較する
        System.out.println("abc".equalsIgnoreCase("ABC"));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isBlank()
        System.out.println("文字列の状態検査(空かどうかtrueで返す)");
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("　".isBlank());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isEmpty()
        System.out.println("length()が0の場合にのみ、trueを返す");
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("　".isEmpty());

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#startsWith(java.lang.String)
        System.out.println("○○の文字で始まるかを判定する");
        System.out.println("ピカチュー".startsWith("ピカ"));
        System.out.println("ピチュー".startsWith("ピカ"));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#endsWith(java.lang.String)
        System.out.println("○○で終わるかを判定する");
        System.out.println("あきこ".endsWith("こ"));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#toLowerCase()
        System.out.println("大文字で返す、小文字で返す");
        System.out.println("abc".toUpperCase());
        System.out.println("ABC".toLowerCase());

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#trim()
        System.out.println("前後の空白を取り除く");
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#trim()
        System.out.println(" This is a pen.     ".trim());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#strip()
        System.out.println("　This is a pen.　".strip());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#stripLeading()
        System.out.println("　This is a pen.　".stripLeading());
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#stripTrailing()
        System.out.println("　This is a pen.　".stripTrailing());

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#length()
        System.out.println("文字列の長さを調べる");
        System.out.println("あい123".length());//5

        System.out.println("サロゲートペアだと長さが倍になる");
        System.out.println("𠀋あ𠀋".length());//5
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#codePointCount(int,int)
        System.out.println("𠀋あ𠀋".codePointCount(0,"𠀋あ𠀋".length()));//3

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
        System.out.println("文字列を分割する");
        String data = "やまだ,男,29";
        String[] dataArray = data.split(",");
        System.out.println(Arrays.toString(dataArray));
        System.out.println("limitは配列の長さを指定");
        System.out.println(Arrays.toString(data.split(",", 2)));
        String data2 = "やまだ,男,";
        System.out.println(Arrays.toString(data2.split(",")));
        System.out.println(Arrays.toString(data2.split(",", 3)));
        String data3 = "やまだ,男,29,a";
        System.out.println(Arrays.toString(data3.split(",")));
        System.out.println(Arrays.toString(data3.split(",", 3)));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#charAt(int)
        System.out.println("任意の一文字を取得する");
        System.out.println("abc".charAt(1));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#substring(int)
        System.out.println("任意の任意部分を取得する");
        System.out.println("abcdef".substring(2));
        System.out.println("abcdef".substring(2, 4));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replace(java.lang.CharSequence,java.lang.CharSequence)
        System.out.println("文字列の置き換え");
        System.out.println("ABAABAAABA".replace("AB", "c"));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replaceAll(java.lang.String,java.lang.String)
        System.out.println("ABAABAAABA".replaceAll("A{2}", "c"));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replaceFirst(java.lang.String,java.lang.String)
        System.out.println("ABAABAAABA".replaceFirst("A{2}", "c"));

        System.out.println("文字列を繰り返す");
        System.out.println("ねこ".repeat(10));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(java.lang.String)
        System.out.println("文字列の検索");
        //見つかればindex番号、見つからなかったら負の数(-1)を返す
        System.out.println("abcdef".indexOf("c"));
        System.out.println("abcdef".indexOf("java"));
        System.out.println("this is java".indexOf("java"));

        String word = "にっこうこくりつこうえん";
        String key = "こ";

        if (word.indexOf(key) >= 0) {
            System.out.println(word + "から" + key + "は" + (word.indexOf(key) + 1) + "文字目に発見");
        }else {
            System.out.println(word + "から" + key + "は見つかりません");
        }

        //Unicodeのコードポイントを返す

        //キーワードが何回含まれるか調べる
        int  fromIndex = 0,count = 0,find = -1;
        while (fromIndex < word.length()) {
            find = word.indexOf(key,fromIndex);//検索
            if (find >= 0) {
                count++; //文字列をカウント
                fromIndex = find + key.length(); //検索の開始位置を更新
            } else {
                break;
            }
        }
        System.out.println("探索対象:" + word);
        System.out.println("キーワード:" + key);
        System.out.println("発見した個数:" + count);
    }
}
