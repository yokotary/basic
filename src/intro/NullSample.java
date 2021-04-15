package intro;

//Nullの例外処理を発生させる
public class NullSample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());//NullPointerException
    }
}