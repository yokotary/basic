package intro;

//変数の宣言の仕方
public class Variable {
    public static void main(String[] args) {
        //整数型
        byte b = 10; //-128~127まで
        short s = 32000;
        int i = 1000000; //基本これ使う
        long l = 10000000; //最後にL付けることもできる

        //浮動小数点型
        float f = 12.34f; //最後のf必須
        double d = 123.456;

        //文字型
        char c = 'A'; //ダブルクォーテーションでは動かない
        char c2 = '\u0065'; //Unicodeの文字コードで指定する事もできる

        //ブーリアン型
        boolean bool = true; //trueかfalse

        //表示
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(bool);
    }
}
