package objectSample.exceptionSample;

        //実行時例外の例
class ExceptionSample2 {
    public static void main(String[] args) {
        String str1 = "abc", str2 = null;
        try {
            System.out.println(str1.length());
            System.out.println(str2.length());//実行時例外が発生
        } catch (NullPointerException e) {
            e.printStackTrace();//どのメソッドで発生したか追跡する
            System.out.println("例外が発生しました");
        }
    }
}
