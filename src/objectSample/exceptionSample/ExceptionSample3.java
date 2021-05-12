package objectSample.exceptionSample;

//例外をスルーするメソッドの書き方
class ExceptionSample3 {
    public static int getLength(String word) throws Exception {
        try {
            return word.length();
        } catch (Exception e) {
            throw new Exception("キーワードが異常です");
        }
    }
    public static void main(String[] args) {
        //メソッドで検査例外をスローするとtry catchブロックを書く必要がある
        try {
            System.out.println(getLength("abc"));
            System.out.println(getLength(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
